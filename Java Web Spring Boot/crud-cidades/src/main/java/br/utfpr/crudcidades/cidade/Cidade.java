package br.utfpr.crudcidades.visao;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 *
 * @author Adriane
 */
public final class Cidade {
    
    @NotBlank(message = "{app.cidade.blank}")
    @Size(min = 5, max = 60, message = "{app.cidade.size}")
    private final String nome;
    
    @NotBlank(message = "{app.estado.blank}")
    @Size(min = 2, max = 2, message = "{app.estado.size}")
    private final String estado;
    
    public Cidade(final String nome, final String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }    
    
}

/*
    @NotBlank -> Impede que sejam aceitos valores nulos ou espaços em branco
    @Size -> Restringe o limite de caracteres
*/