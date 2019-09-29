package org.ven.springlearning;

import org.springframework.stereotype.Component;

@Component
public class FooImpl implements IFoo{
    public int getBar() {
        return 10;
    }
}
