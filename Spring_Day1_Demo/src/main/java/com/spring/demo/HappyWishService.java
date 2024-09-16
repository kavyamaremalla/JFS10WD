package com.spring.demo;

import org.springframework.stereotype.Component;

@Component("happyWishService")

public class HappyWishService implements WishService{
    @Override
    public String getDailyWish() {
        return "Good luck and All the best for today's match";
    }
}
