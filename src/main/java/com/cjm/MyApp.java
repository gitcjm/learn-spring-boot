package com.cjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by cjm on 7/5/17.
 */

@EnableAutoConfiguration
@ComponentScan({"com.cjm", "com.shenyi"})
public class MyApp {

    public static void main(String[] args) {

        SpringApplication.run(MyApp.class, args);
    }
}
