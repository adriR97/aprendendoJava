package br.utfpr.crudcidades.usuario;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adriane
 */
@Service
public class UsuarioDetailsService implements UserDetailsService {

    private final UsuarioRepository repository;

    public UsuarioDetailsService(final UsuarioRepository repository) {
        this.repository = repository;
    }   
    
    @Override
    public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
        var usuario = repository.findByNome(user);
        
        if(usuario == null)
            throw new UsernameNotFoundException("Usuário não encontrado");
        
        return usuario;
    }
    
}
