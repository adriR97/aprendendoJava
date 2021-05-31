package br.utfpr.crudcidades.cidade;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import javax.servlet.http.*;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Adriane
 */
@Controller
public class CidadeController {
    
    private final CidadeRepository repository;
    
    public CidadeController(CidadeRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/")
    public String listar(Model memoria, Principal usuario, HttpSession sessao,
            HttpServletResponse response) {
        response.addCookie(new Cookie("listar", LocalDateTime.now().toString()));
        memoria.addAttribute(
            "listaCidades", 
            repository.findAll()
                .stream()
                .map(Cidade::clonar)
                .collect(Collectors.toList())
        );   
        sessao.setAttribute("usuarioAtual", usuario.getName());
        return "/crud";
    }
    
    @PostMapping("/criar")
    public String criar(@Valid Cidade cidade, BindingResult validacao, 
            Model memoria, HttpServletResponse response) {
        response.addCookie(new Cookie("criar", LocalDateTime.now().toString()));
        
        if(validacao.hasErrors()) {
            validacao.getFieldErrors()
                .forEach(error -> 
                    memoria.addAttribute(
                        error.getField(),
                        error.getDefaultMessage()
                    )
                );
            
            memoria.addAttribute("nomeInformado", cidade.getNome());
            memoria.addAttribute("estadoInformado", cidade.getEstado());
            memoria.addAttribute("listaCidades", repository.findAll());
            return ("/crud");
        } else {
            repository.save(cidade.clonar());
        }       
        
        return "redirect:/";
    }
    
    @GetMapping("/excluir")
    public String excluir(@RequestParam String nome, @RequestParam String estado,
            HttpServletResponse response) {
        response.addCookie(new Cookie("excluir", LocalDateTime.now().toString()));
        var cidadeEncontrada = repository.findByNomeAndEstado(nome, estado);
        cidadeEncontrada.ifPresent(repository::delete);
        return "redirect:/";
    }
    
    @GetMapping("/preparaAlterar")
    public String preparaAlterar(@RequestParam String nome, 
            @RequestParam String estado, Model memoria) {
        
        var cidadeAtual = repository.findByNomeAndEstado(nome, estado);
        cidadeAtual.ifPresent(cidadeEncontrada -> {
            memoria.addAttribute("cidadeAtual", cidadeEncontrada);
            memoria.addAttribute("listaCidades", repository.findAll());
        });        
        return "/crud";
    }
    
    @PostMapping("/alterar")
    public String alterar(@RequestParam String nomeAtual,
            @RequestParam String estadoAtual, Cidade cidade, 
            HttpServletResponse response) {  
        
        response.addCookie(new Cookie("alterar", LocalDateTime.now().toString()));
        var cidadeAtual = repository.findByNomeAndEstado(nomeAtual, estadoAtual);        
        if(cidadeAtual.isPresent()) {
            var cidadeEncontrada = cidadeAtual.get();
            cidadeEncontrada.setNome(cidade.getNome());
            cidadeEncontrada.setEstado(cidade.getEstado());
            repository.saveAndFlush(cidadeEncontrada);
        }        
        return "redirect:/";
    }
    
    @GetMapping("/mostrar")
    @ResponseBody
    public String cookieAlterar(@CookieValue String listar) {
        return "Último acesso ao método listar(): " + listar;
    }
    
}

/*
    @Controller -> Indica para o Spring que é uma classe que recebe requisições
    vindas do navegador.
    @GetMapping("/") -> Qualquer solicitação feita para o endereço, neste caso
    a raiz da URL, que deve ser entregue para o método indicado.
    @RequestParam -> Mapeia os parâmetros enviados pelo formulário.
    @Valid -> Aciona a validação quando ele receber um objeto do tipo Cidade
    BindingResult -> Recebe possíveis erros gerados durante a validação
*/