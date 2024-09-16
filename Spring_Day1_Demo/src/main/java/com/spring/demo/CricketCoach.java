package com.spring.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("myCricketCoach")
//@Scope("prototype" )
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

//    @Autowired
    private WishService wishService;

//    ArrayList

    @Value("${email}")
    private String email;

    @Autowired
    public CricketCoach(@Qualifier("happyWishService") WishService wishService) {
        this.wishService = wishService;
    } //Constructor-Injection

    public String getDailyWorkOut(){
        return "Batting Practice";
    }

    @Override
    public String dailyWish(){
        return  wishService.getDailyWish();
    }

    public WishService getWishService() {
        return wishService;
    }

//    @Autowired
    public void setWishService(WishService wishService) {
        this.wishService = wishService;
    } // setter injection

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } // setter injection

    @PostConstruct
    public void startUpMethod(){
        System.out.println("Started");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Destroyed");
    }
}
