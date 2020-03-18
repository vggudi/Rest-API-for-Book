package com.mojro.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mojro.spring.entity.Book;

/**
 * The interface Phone repository.
 *
 * @author Robley Gori - ro6ley.github.io
 */
@Repository
public interface BookRepository extends JpaRepository<Book, String> {
  
}