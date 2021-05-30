package br.utfpr.crudcidades.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Adriane
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
    public Usuario findByNome(String nome);
    
}