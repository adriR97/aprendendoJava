package br.utfpr.crudcidades;

import javax.validation.Validator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class CrudCidadesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudCidadesApplication.class, args);
    }
    
    @Bean
    public MessageSource messageSource() {
        /* Define o nome e o tipo de codificação do arquivo que estão as 
        mensagens de validação*/
        
        ReloadableResourceBundleMessageSource messageSource = 
                new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:message");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
    
    @Bean
    public Validator getValidator() {
        /* Registra o arquivo de mensagens para ser usando com as validações */
        
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return bean;
    }

}

/*
    @SpringBootApplication: Define que é um projeto Spring Boot e inicializa
    as configurações padrão para esse tipo de projeto.
*/