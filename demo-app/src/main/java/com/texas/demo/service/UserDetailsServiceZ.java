package com.texas.demo.service;

import com.texas.demo.model.User;
import com.texas.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceZ implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUserName(username).orElseThrow(
                () -> new RuntimeException("User Not Found")
        );
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                null,
                new GrantedAuthority(user.getRole().toString())
        )
    }

    public Set>
}
