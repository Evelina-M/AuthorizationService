package ru.netology.AuthorizationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.AuthorizationService.model.Authorities;

import java.util.List;

@SpringBootApplication
public class ServiceAuthorization {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAuthorization.class, args);
    }

}