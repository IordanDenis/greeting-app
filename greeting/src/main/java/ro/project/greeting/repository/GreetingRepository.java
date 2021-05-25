package ro.project.greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ro.project.greeting.entity.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Integer> {
    
}

