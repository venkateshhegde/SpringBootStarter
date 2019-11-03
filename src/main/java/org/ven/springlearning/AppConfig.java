package org.ven.springlearning;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean (initMethod = "init", destroyMethod = "deinit")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SecondBean secondBean() {
        return new SecondBean();
    }

}
