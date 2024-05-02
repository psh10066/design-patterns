package com.psh10066.designpatterns._02_structural_patterns._06_adapter._00_common;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
