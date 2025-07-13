package com.cognizant.springlearn.jwt_auth_demo.service;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.*;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) {
        // Hardcoded user: user / pwd
        if ("user".equals(username)) {
            return new User(
                "user",
                "$2a$10$gVWHPwA2z9Ygf/He1f0nK.Hs6UiWaaFQbfOee9KlyeRoN3MkxKx0W", // "pwd" encrypted
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))
            );
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
}
