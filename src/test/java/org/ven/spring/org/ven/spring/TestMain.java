package org.ven.spring.org.ven.spring;

import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.ven.springlearning.IFoo;

@SpringBootApplication
public class TestMain {
    public static void main(String[] args) {
        SpringApplication.run(TestMain.class, args);
    }



}