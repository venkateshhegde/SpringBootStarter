package org.ven.springlearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class FooImpl2 implements IFoo {

    @Value("${org.ven.testMe: 210}")
    private int valueToBeUsed;


    @Value("${org.ven.testMeStr:Hello World\n\n}")
    private String valueToBeUsedStr;

    @Value("${org.ven.testMeArr:Hello,World,One}")
    private String[] valueToBeUsedArr;

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
