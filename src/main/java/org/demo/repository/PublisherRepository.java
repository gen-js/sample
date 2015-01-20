package org.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.demo.domain.Publisher;

public interface PublisherRepository extends MongoRepository<Publisher, String> {

    public List<Publisher> findByName(String name);

}