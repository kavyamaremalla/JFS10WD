package com.spring.batch.spring_batch;

import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person person) throws Exception {

        String firstName = person.firstName().toUpperCase();
        String lastName = person.lastName().toUpperCase();

        System.out.println("Transformed Person : " + firstName + " " + lastName);

        return new Person(firstName, lastName);
    }
}
