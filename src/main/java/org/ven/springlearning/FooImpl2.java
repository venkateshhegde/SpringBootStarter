package org.ven.springlearning;

import org.springframework.stereotype.Component;

@Component
public class FooImpl2 implements IFoo {
    @Override
    public int getBar() {
        return 110;
    }
}
