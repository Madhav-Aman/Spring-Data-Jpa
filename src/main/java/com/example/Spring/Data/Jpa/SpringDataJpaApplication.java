package com.example.Spring.Data.Jpa;

import com.example.Spring.Data.Jpa.service.PaginationService;
import com.example.Spring.Data.Jpa.service.UserServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext apt = SpringApplication.run(SpringDataJpaApplication.class, args);

		UserServices services = apt.getBean(UserServices.class);
//		System.out.println(services.getByUsernameAndEmail("madhav","madhav@gmail.com"));
//		System.out.println(services.getByUsernameorEmail("madhav","pawa@gmail.com"));
//		System.out.println(services.getByAgeIsEnqual(23));
//		System.out.println(services.getBetweenAge(20,24));
//		System.out.println(services.getByAgeNotNull());
//		System.out.println(services.getUsernameStartingWith("p"));
//		System.out.println(services.findByAgeOrderByDesc());
//		System.out.println(services.findByAgeOrderByDesc());
//		System.out.println(services.findByAge(19));
//		System.out.println(services.findByLapID(19));

		PaginationService pg = apt.getBean(PaginationService.class);

		System.out.println(pg.getData(1,2));
	}

}
