package org.ven.springlearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FooImpl implements IFoo{

    @Value("${org.ven.testMe: 20}")
    private int valueToBeUsed;

    public int getBar() {
        return valueToBeUsed;
    }
}
