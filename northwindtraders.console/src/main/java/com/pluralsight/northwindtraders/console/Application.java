package com.pluralsight.northwindtraders.console;

import com.pluralsight.northwindtraders.console.dao.ProductDao;
import com.pluralsight.northwindtraders.console.dao.SimpleProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	SimpleProductDao productDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}
}
