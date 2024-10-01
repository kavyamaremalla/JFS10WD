package com.security.todo.management.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderImpl {

    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("john")); //$2a$10$y1s/hHqvieYmaCZ5KOHl1OpPPUt0RaqeT7FAIG.WZDl9Eu66pHGlG
        System.out.println(passwordEncoder.encode("admin")); //$2a$10$yyNN9EVWJQ2C5e7piectGOdrEGiTYkvMsfqzEfEwARa7BilA7HfVW
    }
}
