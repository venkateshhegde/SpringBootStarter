package org.ven.spring.org.ven.spring.org.ven.spring;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.ven.springlearning.IFoo;

@Configuration
public class AppConfig {

    //Dependency Injection bean def, and primary preference.
    @Bean
    @Primary
    public IFoo getFoo() {
        return Mockito.mock(IFoo.class);
    }
}
