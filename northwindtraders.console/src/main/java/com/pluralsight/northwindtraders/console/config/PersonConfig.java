package com.pluralsight.northwindtraders.console.config;

import com.pluralsight.northwindtraders.console.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
    private Person person;


    @Bean
    public Person personFromConfig(){
        return person;
    }

    public PersonConfig(@Value("${person.firstname}") String firstName,
                        @Value("${person.lastname}") String lastName) {

        person = new Person(firstName, lastName);
    }

}
