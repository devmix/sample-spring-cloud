package com.github.devmix.sample.spring.cloud.services.app.service1.mongo.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Sergey Grachev
 */
@Document
@Data
public class MongoUser {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String login;

    @Override
    public String toString() {
        return "MongoUser{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
