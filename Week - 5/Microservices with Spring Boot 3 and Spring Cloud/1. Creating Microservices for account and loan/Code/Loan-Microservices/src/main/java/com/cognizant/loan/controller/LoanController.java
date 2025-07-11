package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private List<Loan> loans = new ArrayList<>();

    public LoanController() {
        loans.add(new Loan("H00987987972342", "car", 400000, 3258, 18));
        loans.add(new Loan("H00112233445566", "home", 1500000, 10500, 120));
        loans.add(new Loan("H00775588990011", "education", 600000, 5600, 60));
        loans.add(new Loan("H00990011223344", "personal", 200000, 2500, 24));
    }

    @GetMapping
    public List<Loan> getAllLoans() {
        return loans;
    }

    @GetMapping("/{number}")
    public Loan getLoanByNumber(@PathVariable String number) {
        return loans.stream()
                .filter(l -> l.getNumber().equals(number))
                .findFirst()
                .orElse(null);
    }

    static class Loan {
        private String number;
        private String type;
        private double loan;
        private double emi;
        private int tenure;

        public Loan(String number, String type, double loan, double emi, int tenure) {
            this.number = number;
            this.type = type;
            this.loan = loan;
            this.emi = emi;
            this.tenure = tenure;
        }

        public String getNumber() { return number; }
        public String getType() { return type; }
        public double getLoan() { return loan; }
        public double getEmi() { return emi; }
        public int getTenure() { return tenure; }
    }
}