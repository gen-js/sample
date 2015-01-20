package org.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.demo.domain.Book;

public interface BookRepository extends MongoRepository<Book, String> {

    public List<Book> findByTitle(String title);

}