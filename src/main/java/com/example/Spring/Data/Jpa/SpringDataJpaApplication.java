package com.example.Spring.Data.Jpa;


import com.example.Spring.Data.Jpa.service.TableService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) throws SQLException {

		ApplicationContext apt = SpringApplication.run(SpringDataJpaApplication.class, args);
		TableService ts =apt.getBean(TableService.class);
		System.out.println(ts.getAllTablesAndColumns());
	}

}
