package com.github.devmix.sample.spring.cloud.services.app.service1.mongo;

import com.github.devmix.sample.spring.cloud.services.app.service1.mongo.entities.MongoUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Sergey Grachev
 */
public interface MongoUserRepository extends MongoRepository<MongoUser, String> {

    List<MongoUser> findByLogin(String login);
}
