package br.utfpr.crudcidades.cidade;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Adriane
 */
public interface CidadeRepository extends JpaRepository<CidadeEntidade, Long> {
    
    public Optional<CidadeEntidade> findByNomeAndEstado(String nome, String estado);
    
}

/*
    Interface que irá gerenciar a classe CidadeEntidade.
    No parâmetro do JpaRepository são passados a classe que será gerenciada
    e o tipo de dados da chave primária.

    Optional -> Como não é possível saber se a cidade existe, o Optional
    permite fazer a validação antes da exclusão.
*/