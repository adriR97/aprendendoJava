package br.utfpr.crudcidades.visao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Adriane
 */
@Controller
public class CidadeController {
    
    @GetMapping("/")
    public String listar() {
        return "crud.html";
    }
    
}