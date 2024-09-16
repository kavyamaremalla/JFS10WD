package com.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.demo")
@PropertySource("application.properties")
public class SportsConfig {

//    @Bean
    //define third party libraries
}
