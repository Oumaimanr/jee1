package com.bibliotheque.servicebatch.client;


import com.bibliotheque.servicebatch.model.Loan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Component
@FeignClient(name = "service-loans", url = "http://localhost:8083/api/loans")
public interface LoanClient {

    @GetMapping("/overdue")
    List<Loan> getOverdueLoans();

    @PostMapping("/update-penalties")
    void updatePenalties(List<Loan> loans);
}
