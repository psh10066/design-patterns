package com.psh10066.designpatterns._02_structural_patterns._06_adapter._02_after;

import com.psh10066.designpatterns._02_structural_patterns._06_adapter._00_common.Account;
import com.psh10066.designpatterns._02_structural_patterns._06_adapter._00_common.AccountService;
import com.psh10066.designpatterns._02_structural_patterns._06_adapter._00_common.UserDetails;
import com.psh10066.designpatterns._02_structural_patterns._06_adapter._00_common.UserDetailsService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetailsService implements UserDetailsService {

    private final AccountService accountService;

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
