package com.bibliotheque.servicebatch.runner;


import com.bibliotheque.servicebatch.client.LoanClient;
import com.bibliotheque.servicebatch.model.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PenaltyRunner implements CommandLineRunner {

    @Autowired
    private LoanClient loanClient;

    @Override
    public void run(String... args) {
        List<Loan> overdueLoans = loanClient.getOverdueLoans();
        for (Loan loan : overdueLoans) {
            long daysOverdue = loan.getReturnDate().toEpochDay() - loan.getDueDate().toEpochDay();
            loan.setPenalty(daysOverdue * 5.0); // Calcul des pénalités
        }
        loanClient.updatePenalties(overdueLoans);
        System.out.println("Penalties calculated and updated successfully.");
    }
}
