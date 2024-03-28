package com.example.Spring.Data.Jpa;


import com.example.Spring.Data.Jpa.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext apt = SpringApplication.run(SpringDataJpaApplication.class, args);
		ProductService p = apt.getBean(ProductService.class);

		p.update(1);
	}

}
