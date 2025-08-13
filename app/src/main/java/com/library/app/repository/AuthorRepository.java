package com.library.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.app.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long > {

    

}
