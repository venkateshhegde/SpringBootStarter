package org.ven.springlearning;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//Setup to receive Spring internal events

@Component
public class AnnotationDrivenContextStartedListener {
    // @Async
    @EventListener
    public void handleContextStart(ContextStartedEvent cse) {
        System.out.println("Handling context started event.");
    }
}