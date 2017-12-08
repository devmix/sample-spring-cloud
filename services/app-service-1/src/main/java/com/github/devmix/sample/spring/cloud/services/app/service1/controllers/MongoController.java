package com.github.devmix.sample.spring.cloud.services.app.service1.controllers;

import com.github.devmix.sample.spring.cloud.services.app.service1.mongo.MongoUserRepository;
import com.github.devmix.sample.spring.cloud.services.app.service1.mongo.entities.MongoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author Sergey Grachev
 */
@RestController
@RequestMapping("/app/mongo")
public class MongoController {

    @Autowired
    private MongoUserRepository userRepository;

    @GetMapping("/create/{login}")
    public MongoUser create(@PathVariable("login") final String login) {
        final MongoUser user = new MongoUser();
        user.setLogin(login);
        user.setFirstName(UUID.randomUUID().toString());
        user.setLastName(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    @GetMapping("/findByLogin/{login}")
    public List<MongoUser> findByLogin(@PathVariable("login") final String login) {
        return userRepository.findByLogin(login);
    }
}
