package com.pluralsight.first_spring_app;

import com.pluralsight.first_spring_app.model.Person;
import com.pluralsight.first_spring_app.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleApplication implements CommandLineRunner {

    @Autowired
    PersonDAO personDAO;

    @Override
    public void run(String... args) throws Exception {
        Person person = personDAO.find();
        System.out.println(person);
    }
}
