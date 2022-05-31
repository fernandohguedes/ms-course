package com.devsuperior.hruser.resources;

import com.devsuperior.hruser.entities.User;
import com.devsuperior.hruser.repositories.UserRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserResouce {

    @Autowired
    private UserRepository repository;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = repository.findById(id).get();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {
        User user = repository.findByEmail(email);
        return ResponseEntity.ok(user);
    }
}
