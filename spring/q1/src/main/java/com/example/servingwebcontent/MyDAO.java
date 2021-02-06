package com.example.servingwebcontent;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class MyDAO {

//    private static Person errPerson = new Person("err", "err");
    List<Person> persons;

    public MyDAO() {
        persons = new ArrayList<>();
//        persons.add(new Person("Dima", "Novikov"));
//        persons.add(new Person("Sasha", "Mohov"));
    }

    public List<Person> getPersons() {
        return persons;
    }

//    public Person getPerson(int id) {
//
//        return id < persons.size() ? persons.get(id) : errPerson;
//    }
}
