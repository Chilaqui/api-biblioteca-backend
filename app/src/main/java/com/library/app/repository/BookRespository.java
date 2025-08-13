package com.library.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.app.model.Book;

public interface BookRespository extends JpaRepository<Book, Long> {

}
