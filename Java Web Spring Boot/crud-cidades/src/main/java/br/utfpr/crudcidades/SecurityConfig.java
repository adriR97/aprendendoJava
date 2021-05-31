package br.utfpr.crudcidades;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.*;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Adriane
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /* Mapeando as autorizações do sistema */
        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/").hasAnyAuthority("listar", "admin")
            .antMatchers("/criar").hasAuthority("admin")
            .antMatchers("/excluir").hasAuthority("admin")
            .antMatchers("/preparaAlterar").hasAuthority("admin")
            .antMatchers("/alterar").hasAuthority("admin")
            .antMatchers("/mostrar").authenticated()
            .anyRequest().denyAll()
            .and()
            .formLogin()
            .loginPage("/login.html").permitAll()
            .defaultSuccessUrl("/", false)
            .and().logout().permitAll();
    }
    
    @Bean
    public PasswordEncoder cifrador() {
        /* Define o algoritmo de cifragem que o Spring Security deve seguir */
        return new BCryptPasswordEncoder();
    }
    
    @EventListener(ApplicationReadyEvent.class)
    public void encodeSenha() {
        System.out.println(this.cifrador().encode("admin1234"));
    }
    
    @EventListener(InteractiveAuthenticationSuccessEvent.class)
    public void usuarioAtual(InteractiveAuthenticationSuccessEvent event) {
        var usuario = event.getAuthentication().getName();
        System.out.println(usuario);
    }
    
}

/* 
    Classe para autenticação e autorização.
    @EnableWebSecurity -> Habilita o uso dos recursos do Spring Security.
    @Configuration -> Indica que a classe carrega informações que devem ser 
    usadas pelo Spring Boot.
    
    
*/