package com.library.app.model.dto;

import java.time.LocalDateTime;

public class LoanDTO {

    private Long id;
    private LibraryUserDTO libraryUser;
    private BookDTO book;
    private LocalDateTime loanDate;
    private LocalDateTime returnDate;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LibraryUserDTO getLibraryUser() {
        return libraryUser;
    }
    public void setLibraryUser(LibraryUserDTO libraryUser) {
        this.libraryUser = libraryUser;
    }
    public BookDTO getBook() {
        return book;
    }
    public void setBook(BookDTO book) {
        this.book = book;
    }
    public LocalDateTime getLoanDate() {
        return loanDate;
    }
    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }
    public LocalDateTime getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }


}
