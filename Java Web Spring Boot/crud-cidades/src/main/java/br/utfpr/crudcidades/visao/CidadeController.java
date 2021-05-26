package br.utfpr.crudcidades.visao;

import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Adriane
 */
@Controller
public class CidadeController {
    
    @GetMapping("/")
    public String listar(Model memoria) {
        var cidades = Set.of(
            new Cidade("Colombo", "PR"),
            new Cidade("Curitiba", "PR"),
            new Cidade("Guarulhos", "SP")
        );
        
        memoria.addAttribute("listaCidades", cidades);        
        return "/crud";
    }
    
}