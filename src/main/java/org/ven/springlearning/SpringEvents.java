package org.ven.springlearning;

import org.springframework.context.ApplicationEvent;

//Spring event
public class SpringEvents extends ApplicationEvent {
    private String message;

    public SpringEvents(Object source, String message) {
        super(source);
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
