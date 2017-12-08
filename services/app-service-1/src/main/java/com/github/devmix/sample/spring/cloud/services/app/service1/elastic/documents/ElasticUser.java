package com.github.devmix.sample.spring.cloud.services.app.service1.elastic.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author Sergey Grachev
 */
@Document(indexName = "sample", type = "user")
@Data
public class ElasticUser {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String login;

    @Override
    public String toString() {
        return "ElasticUser{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
