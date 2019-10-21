package org.ven.springlearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class FooImpl2 implements IFoo {

    //Spring properties with default integer
    @Value("${org.ven.testMe: 210}")
    private int valueToBeUsed;

    //Spring properties with default Strings
    @Value("${org.ven.testMeStr:Hello World\n\n}")
    private String valueToBeUsedStr;

    //Spring properties with default Arrays
    @Value("${org.ven.testMeArr:Hello,World,One}")
    private String[] valueToBeUsedArr;

    //Spring properties with default SpEL
    @Value("#{systemEnvironment['LOGNAME'] ?: 'Phuntu'}")
    private String valueToBeUsedSpEL;

    @Override
    public int getBar() {
        System.out.println(valueToBeUsedStr);
        System.out.println(Arrays.asList(valueToBeUsedArr));
        System.out.println(valueToBeUsedSpEL);

        return valueToBeUsed;
    }
}
