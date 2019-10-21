package org.ven.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.ven.spring.org.ven.spring.org.ven.spring.AppConfig;
import org.ven.springlearning.IFoo;

//Spring JUNIT Support
@RunWith(SpringJUnit4ClassRunner.class)

//Spring Bean info via AppConfig and annotations
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class Tests {

    //Autowire Spring bean implemented as Mockito bean
    @Autowired
    IFoo foo;

    //Mockito test with JUnit
    @Test
    public void testMe()
    {
        Mockito.when(foo.getBar()).thenReturn(2011);
        Assert.assertEquals(2011,
                (long) foo.getBar());
    }



}
