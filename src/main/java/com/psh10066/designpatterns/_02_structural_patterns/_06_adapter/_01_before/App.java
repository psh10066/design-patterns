package com.psh10066.designpatterns._02_structural_patterns._06_adapter._01_before;

import com.psh10066.designpatterns._02_structural_patterns._06_adapter._00_common.Account;
import com.psh10066.designpatterns._02_structural_patterns._06_adapter._00_common.AccountService;
import com.psh10066.designpatterns._02_structural_patterns._06_adapter._00_common.LoginHandler;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        Account account = accountService.findAccountByUsername("psh10066");

        // 타입이 달라서 로그인 불가
//        LoginHandler loginHandler = new LoginHandler(accountService);
//        String login = loginHandler.login("psh10066", "psh10066");
//        System.out.println(login);
    }
}
