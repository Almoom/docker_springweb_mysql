package com.example.servingwebcontent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class GreetingController {

//    @Autowired
//    MyDAO dao;

    @Autowired
    DbHandler db;

    @GetMapping()
    public String start(Model model) {
        model.addAttribute("people", db.select());
        return "start";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/people")
    public String allPeople(Model model) {
        model.addAttribute("people", db.select());
        return "people";
    }

    @GetMapping("/new")
    public String newPerson(Model model) {
        return "new";
    }


    @PostMapping("/")
    public String create(@RequestParam("name") String name,
                         @RequestParam("surname") String surname,
                         @RequestParam("position") String position,
                         Model model) {
//        Person person = new Person(name, surname, position);
//        dao.getPersons().add(person);
        db.insert(name, surname, position);
        return "redirect:/";
    }

//    @PostMapping()
//    public String create(@ModelAttribute("person") Person person) {
//        dao.getPersons().add(person);
//        return "redirect:/people";
//    }

//    @GetMapping("/")
//    public String upload() {
//        System.out.println("Hello!!!");
//        return "index";
//    }
}
