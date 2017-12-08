package com.github.devmix.sample.spring.cloud.services.app.service1.controllers;

import com.github.devmix.sample.spring.cloud.services.app.service1.elastic.ElasticUserRepository;
import com.github.devmix.sample.spring.cloud.services.app.service1.elastic.documents.ElasticUser;
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
@RequestMapping("/app/elastic")
public class ElasticController {

    @Autowired
    private ElasticUserRepository userRepository;

    @GetMapping("/create/{login}")
    public ElasticUser create(@PathVariable("login") final String login) {
        final ElasticUser user = new ElasticUser();
        user.setLogin(login);
        user.setFirstName(UUID.randomUUID().toString());
        user.setLastName(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    @GetMapping("/findByLogin/{login}")
    public List<ElasticUser> findByLogin(@PathVariable("login") final String login) {
        return userRepository.findByLogin(login);
    }
}
