package com.loopme.api.administration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.loopme.api.administration"})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.loopme.api.administration.persistence.repository"})
public class AdministrationApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdministrationApiApplication.class, args);
    }
}
