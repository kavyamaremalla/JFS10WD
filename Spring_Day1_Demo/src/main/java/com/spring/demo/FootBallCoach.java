package com.spring.demo;

public class FootBallCoach implements Coach{

    private WishService wishService;

    public WishService getWishService() {
        return wishService;
    }

    public String getDailyWorkOut(){
        return "Kicking Practice";
    }

    public String dailyWish(){
        return  wishService.getDailyWish();
    }
}
