package ro.project.greeting.controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ro.project.greeting.entity.Greeting;
import ro.project.greeting.service.GreetingService;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService service;

    @GetMapping("/")
    public String homepage() {
        return "Welcome to the greeting page!";
    }
    
    
    @PostMapping("/greeting/add")
    public Map<String, Object> addGreeting(@RequestBody Greeting g1) {
        
        if (service.addNewGreeting(g1)) {
            return Collections.singletonMap("Greeting has been added successfully", true);
        }

        return Collections.singletonMap("Greeting has been added successfully", false);
    }


    @GetMapping("/greeting/getAll")
    public List<Greeting> getAllGreetings() {
        return service.getAll();
    }



}

