package org.ven.springlearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@ManagedResource
@Component
public class FooImpl2 implements IFoo {

    @ManagedAttribute(description = "Bean Attr")
    public int getValueToBeUsed() {
        return valueToBeUsed;
    }
    @ManagedAttribute(description = "Bean Attr set")
    public void setValueToBeUsed(int valueToBeUsed) {
        this.valueToBeUsed = valueToBeUsed;
    }



    //Spring properties with default integer
    @Value("${org.ven.testMe: 210}")
    private int valueToBeUsed;

    //Spring properties with default Strings
    @Value("${org.ven.testMeStr:Hello World\n\n}")
    private String valueToBeUsedStr;

    ////a29fa0dadf898dec2e37a246e64042b8b49a902e

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
