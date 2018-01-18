package com.insat.gestionformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.yan.gestionformation.repositories")
@SpringBootApplication(scanBasePackages = {"com.yan.gestionformation","com.yan.gestionformation.Configuration"})

public class GestionFormationApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(GestionFormationApplication.class, args);
	}
}
