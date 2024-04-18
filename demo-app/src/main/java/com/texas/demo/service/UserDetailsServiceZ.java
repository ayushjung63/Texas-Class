package com.texas.demo.service;

import com.texas.demo.enums.Role;
import com.texas.demo.model.User;
import com.texas.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceZ implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username).orElseThrow(
                () -> new RuntimeException("User Not Found")
        );
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
               getSimpleGrantedAuthorities(user.getRole())
        );
    }

    public Set<SimpleGrantedAuthority> getSimpleGrantedAuthorities(Role role){
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(role.name());
        HashSet<SimpleGrantedAuthority> roleSet = new HashSet<>();
        roleSet.add(simpleGrantedAuthority);
        return roleSet;
    }
}
