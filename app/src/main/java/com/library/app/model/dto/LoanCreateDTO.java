package com.library.app.model.dto;

import java.time.LocalDateTime;

public class LoanCreateDTO {
    
    private Long libraryUserId;
    private Long bookId;
    private LocalDateTime loanDate;
    
    public Long getLibraryUserId() {
        return libraryUserId;
    }
    public void setLibraryUserId(Long libraryUserId) {
        this.libraryUserId = libraryUserId;
    }
    public Long getBookId() {
        return bookId;
    }
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    public LocalDateTime getLoanDate() {
        return loanDate;
    }
    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }

}
