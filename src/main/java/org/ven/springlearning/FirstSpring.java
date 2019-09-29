package org.ven.springlearning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstSpring {

    public void showBarAccess()
    {
        System.out.println(foo.getBar());
    }

    @Autowired(required = true)
    IFoo foo;

}
