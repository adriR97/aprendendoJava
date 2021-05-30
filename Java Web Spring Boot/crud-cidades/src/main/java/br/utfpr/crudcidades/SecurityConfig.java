package br.utfpr.crudcidades;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Adriane
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception {
        /* Mapeando as autorizações do sistema */
        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/").hasAnyAuthority("listar", "admin")
            .antMatchers("/criar").hasAuthority("admin")
            .antMatchers("/excluir").hasAuthority("admin")
            .antMatchers("/preparaAlterar").hasAuthority("admin")
            .antMatchers("/alterar").hasAuthority("admin")
            .anyRequest().denyAll()
            .and()
            .formLogin()
            .loginPage("/login.html").permitAll()
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
    
}

/* 
    Classe para autenticação e autorização.
    @EnableWebSecurity -> Habilita o uso dos recursos do Spring Security.
    @Configuration -> Indica que a classe carrega informações que devem ser 
    usadas pelo Spring Boot.
    
    
*/