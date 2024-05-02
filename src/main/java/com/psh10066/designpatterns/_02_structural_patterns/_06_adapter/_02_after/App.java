package com.psh10066.designpatterns._02_structural_patterns._06_adapter._02_after;

import com.psh10066.designpatterns._02_structural_patterns._06_adapter._00_common.AccountService;
import com.psh10066.designpatterns._02_structural_patterns._06_adapter._00_common.LoginHandler;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        AccountUserDetailsService userDetailsService = new AccountUserDetailsService(accountService);

        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("psh10066", "psh10066");
        System.out.println(login);
    }
}
