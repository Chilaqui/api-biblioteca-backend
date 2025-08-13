package com.library.app.model.dto;

import com.library.app.model.dto.enumsDTO.GenreDTO;

public class BookDTO {

    private Long id;
    private String name;
    private String author;
    private GenreDTO gender;
    private String description;
    private int stock;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public GenreDTO getGender() {
        return gender;
    }
    public void setGender(GenreDTO gender) {
        this.gender = gender;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

}
