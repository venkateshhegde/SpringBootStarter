package org.ven.springlearning;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

//Setup to receive Spring internal events
public class ContextRefreshListener
        implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent cse) {
        System.out.println("Handling context refreshed event. ");
    }
}
