package org.ven.springlearning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FirstSpring {

    public void showBarAccess()
    {
        System.out.println(myFoo.getBar());
    }

    @Autowired(required = true)
    @Qualifier("fooImpl2")
    IFoo myFoo;



}
