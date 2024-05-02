package com.psh10066.designpatterns._02_structural_patterns._06_adapter._00_common;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginHandler {

    private final UserDetailsService userDetailsService;

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
