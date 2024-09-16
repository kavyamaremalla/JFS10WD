package com.spring.demo;

import org.springframework.stereotype.Component;

@Component("badWishService")
public class BadWishService implements WishService{
    @Override
    public String getDailyWish() {
        return "Bad Luck";
    }
}
