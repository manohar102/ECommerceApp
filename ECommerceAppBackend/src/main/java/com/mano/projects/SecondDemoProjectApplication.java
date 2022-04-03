package com.mano.projects;

//import org.modelmapper.ModelMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mano.projects.dto.mapper.UserMapper;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mano.projects") //to scan packages mentioned
public class SecondDemoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondDemoProjectApplication.class, args);
    }

}
