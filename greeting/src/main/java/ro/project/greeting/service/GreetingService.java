package ro.project.greeting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.project.greeting.entity.Greeting;
import ro.project.greeting.repository.GreetingRepository;


@Service
public class GreetingService {

    @Autowired
    private GreetingRepository repo;

    public boolean addNewGreeting( Greeting g1) {

        Greeting saved = repo.save(g1);

        if (saved.getGreetingID() > 0 && (saved.getDescription() != null) && saved.getPrice() > 0 && saved.getTypeID() > 0 && saved.getCategoryID() > 0 ){
            return true;
        }

        return false;
    }



    public List<Greeting> getAll() {
        return repo.findAll();
    }
    
}

