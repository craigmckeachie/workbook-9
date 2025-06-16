package com.pluralsight.first_spring_app.repository;

import com.pluralsight.first_spring_app.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

    public Person find(){
        return new Person("Shawn", "Carter", 55 );
    }
}
