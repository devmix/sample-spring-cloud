package com.github.devmix.sample.spring.cloud.services.app.service1.elastic;

import com.github.devmix.sample.spring.cloud.services.app.service1.elastic.documents.ElasticUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author Sergey Grachev
 */
public interface ElasticUserRepository extends ElasticsearchRepository<ElasticUser, String> {

    List<ElasticUser> findByLogin(String login);
}
