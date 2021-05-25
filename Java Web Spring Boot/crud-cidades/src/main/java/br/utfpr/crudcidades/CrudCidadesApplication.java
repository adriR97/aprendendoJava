package br.utfpr.crudcidades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudCidadesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudCidadesApplication.class, args);
    }

}

/*
    @SpringBootApplication: Define que é um projeto Spring Boot e inicializa
    as configurações padrão para esse tipo de projeto.
*/