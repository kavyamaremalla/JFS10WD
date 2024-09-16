package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

//        CricketCoach cricketCoach = new CricketCoach();
//        System.out.println(cricketCoach.getDailyWorkOut());
//        System.out.println(cricketCoach.dailyWish());

//        FootBallCoach footBallCoach = new FootBallCoach();
//        System.out.println(footBallCoach.getDailyWorkOut());
//
//        Coach coach;
//
//        int age = 17;
//
//        if(age > 18){
//            coach = new CricketCoach();
//        }else{
//            coach = new FootBallCoach();
//        }
//
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

        CricketCoach cricketCoach1 = context.getBean("myCricketCoach", CricketCoach.class);
        CricketCoach cricketCoach2 = context.getBean("myCricketCoach", CricketCoach.class);

//        cricketCoach1.setEmail("test@gmail.com");
//        System.out.println(cricketCoach1);
//        System.out.println(cricketCoach2);
//        System.out.println(cricketCoach2.getEmail());

        System.out.println(cricketCoach1.getDailyWorkOut());
        System.out.println(cricketCoach1.dailyWish());
//        cricketCoach1.setEmail("test@gmail.com");
//        System.out.println(cricketCoach1.getEmail());

        context.close();

    }
}
