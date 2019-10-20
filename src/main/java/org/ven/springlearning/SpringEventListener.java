package org.ven.springlearning;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SpringEventListener implements ApplicationListener<SpringEvents> {
    @Override
    public void onApplicationEvent(SpringEvents event) {
        System.out.println("Received spring custom event - " + Thread.currentThread().getName() + " " + event.getMessage());
    }
}