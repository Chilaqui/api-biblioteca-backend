package com.library.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.app.model.LibraryUser;

public interface LibraryUserRepository extends JpaRepository<LibraryUser, Long>{

}
