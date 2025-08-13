package com.library.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.app.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}
