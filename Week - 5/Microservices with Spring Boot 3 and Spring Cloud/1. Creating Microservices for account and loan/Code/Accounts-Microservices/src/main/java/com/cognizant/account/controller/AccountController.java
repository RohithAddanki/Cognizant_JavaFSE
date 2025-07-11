package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private List<Account> accounts = new ArrayList<>();

    public AccountController() {
        accounts.add(new Account("00987987973432", "savings", 234343));
        accounts.add(new Account("00123456789012", "current", 100000));
        accounts.add(new Account("00991122334455", "salary", 54321));
        accounts.add(new Account("00888888888888", "fixed", 200000));
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accounts;
    }

    @GetMapping("/{number}")
    public Account getAccountByNumber(@PathVariable String number) {
        return accounts.stream()
                .filter(a -> a.getNumber().equals(number))
                .findFirst()
                .orElse(null);
    }

    static class Account {
        private String number;
        private String type;
        private double balance;

        public Account(String number, String type, double balance) {
            this.number = number;
            this.type = type;
            this.balance = balance;
        }

        public String getNumber() { return number; }
        public String getType() { return type; }
        public double getBalance() { return balance; }
    }
}