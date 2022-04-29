package com.glsia.tp1;

import com.glsia.tp1.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class Tp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp1Application.class, args);
	}

}
