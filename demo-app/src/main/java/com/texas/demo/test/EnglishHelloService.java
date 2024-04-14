package com.texas.demo.test;

import org.springframework.stereotype.Service;

@Service
public class EnglishHelloService  implements HelloService {
    @Override
    public String getHelloMessage() {
        return "Hello Students";
    }
}
