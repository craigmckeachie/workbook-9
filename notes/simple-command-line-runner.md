# Simple CommandLineRunner

Putting the main method and the CommandLineRunner logic in the same class is a good and common practice in small Spring Boot applications or teaching examples. It keeps things simple, avoids class sprawl, and still adheres to Spring conventions.

✅ Why it works well
Spring Boot will instantiate your @SpringBootApplication class as a bean.

Since it implements CommandLineRunner, Spring will automatically call run() after the context is initialized.

The static main method just boots the application — it doesn't interfere with Spring's DI system.

```java
package com.pluralsight.first_spring_app;

import com.pluralsight.first_spring_app.model.Person;
import com.pluralsight.first_spring_app.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class FirstSpringAppApplication implements CommandLineRunner {

    @Autowired
    private PersonDAO personDAO;

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringAppApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // List all beans
        String[] beanNames = SpringApplication.run(FirstSpringAppApplication.class).getBeanDefinitionNames();
        Arrays.sort(beanNames);
        System.out.println("Beans provided by Spring Boot:");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        // Use the injected DAO
        Person person = personDAO.find();
        System.out.println("Found person: " + person);
    }
}

```
