package com.psh10066.designpatterns._02_structural_patterns._06_adapter._00_common;

public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }
}
