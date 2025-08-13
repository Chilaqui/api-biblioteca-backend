package com.library.app.model.dto;

import java.util.List;

import com.library.app.model.dto.enumsDTO.UserRolDTO;

public class LibraryUserDTO {

    private Long id;
    private String name;
    private UserRolDTO rol;
    private String email;
    private String password;
    private List<LoanDTO> loans;
    
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
    public UserRolDTO getRol() {
        return rol;
    }
    public void setRol(UserRolDTO rol) {
        this.rol = rol;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<LoanDTO> getLoans() {
        return loans;
    }
    public void setLoans(List<LoanDTO> loans) {
        this.loans = loans;
    }
    
}
