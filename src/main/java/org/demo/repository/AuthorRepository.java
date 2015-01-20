package org.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.demo.domain.Author;

public interface AuthorRepository extends MongoRepository<Author, String> {

    public List<Author> findByFirstname(String firstname);
    public List<Author> findByLastname(String lastname);

}