package br.utfpr.crudcidades.usuario;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import javax.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Adriane
 */
@Entity
public class Usuario implements Serializable, UserDetails {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private String nome;
    private String senha;
    
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> papeis;
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public List<String> getPapeis() { return papeis; }
    public void setPapeis(List<String> papeis) { this.papeis = papeis; }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        /* Retorna lista de permissões do usuário */
        return this.papeis
            .stream()
            .map(papelAtual -> new SimpleGrantedAuthority(papelAtual))
            .collect(Collectors.toList());
    }

    @Override
    public String getPassword() { return this.senha; }

    @Override
    public String getUsername() { return this.nome; }

    @Override
    public boolean isAccountNonExpired() { return true; }

    @Override
    public boolean isAccountNonLocked() { return true; }

    @Override
    public boolean isCredentialsNonExpired() { return true; }

    @Override
    public boolean isEnabled() { return true; }   
            
}

/*
    @ElementCollection -> Cria automaticamente uma relação entre Usuario e
    a lista de acessos permitidos.
*/