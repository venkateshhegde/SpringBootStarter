package org.ven.spring.org.ven.spring.org.ven.spring;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.ven.springlearning.IFoo;

@Configuration
public class AppConfig {
    @Bean
    public IFoo getFoo() {
        return Mockito.mock(IFoo.class);
    }
}
