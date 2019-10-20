package org.ven.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SpringEventPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void doStuffAndPublishAnEvent(final String message) {
        System.out.println("Publishing custom event. " + message + " on thread " + Thread.currentThread().getName());
        SpringEvents  customSpringEvent = new SpringEvents(this, message);
        applicationEventPublisher.publishEvent(customSpringEvent);
    }
}