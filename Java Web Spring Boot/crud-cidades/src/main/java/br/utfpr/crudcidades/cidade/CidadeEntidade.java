package br.utfpr.crudcidades.cidade;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Adriane
 */
@Entity(name = "cidade")
public class CidadeEntidade implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private String nome;
    private String estado;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

/*
    @Entity -> Define que a classe é de persistência, o parâmetro name define
    o nome da tabela do banco de dados.
    @Id -> Define a chave primária da tabela.
    @GeneratedValue -> Define que a chave primária vai usar a estratégia de 
    auto-incremento para gerar a chave
*/