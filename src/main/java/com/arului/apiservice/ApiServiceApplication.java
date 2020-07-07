package com.arului.apiservice;

import com.arului.apiservice.modal.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiServiceApplication {

    //Insert records for Person repository
    @Bean
    CommandLineRunner initData(PersonRepository personRepository){
        return args -> {
            Person person1 = new Person ();
            person1.setFirstName ("jim");
            person1.setLastName ("carrey");
            personRepository.save (person1);

            Person person2 = new Person ();
            person2.setFirstName ("amy");
            person2.setLastName ("watson");
            personRepository.save (person2);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiServiceApplication.class, args);
    }



}
