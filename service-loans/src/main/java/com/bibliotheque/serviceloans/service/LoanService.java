package com.bibliotheque.serviceloans.service;


import com.bibliotheque.serviceloans.model.Loan;
import com.bibliotheque.serviceloans.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public Loan saveLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }
    @GetMapping("/overdue")
    public List<Loan> getOverdueLoans() {
        return loanRepository.findAll().stream()
                .filter(loan -> loan.getReturnDate() != null && loan.getReturnDate().isAfter(loan.getDueDate()))
                .collect(Collectors.toList());
    }
    @PostMapping("/update-penalties")
    public void updatePenalties(@RequestBody List<Loan> loans) {
        loanRepository.saveAll(loans);
    }

}
