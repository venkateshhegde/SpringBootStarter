package org.ven.springlearning;

public class SecondBean {
{
    System.out.println("Second Bean Initialized" + hashCode());
}

    private void init() {
        System.out.println("Second Bean IN Initialized" + hashCode());
    }
    private void deinit() {
        System.out.println("Second Bean DEInitialized" + hashCode());
    }


}
