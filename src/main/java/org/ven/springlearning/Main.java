package org.ven.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//Spring Boot App
@SpringBootApplication ()
//RESTFul services
@RestController
@RequestMapping(value="hello")

public class Main implements CommandLineRunner {


//    //HTTPS Support
//    @Bean
//    public EmbeddedServletContainerFactory servletContainer() {
//        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
//            @Override
//            protected void postProcessContext(Context context) {
//                SecurityConstraint securityConstraint = new SecurityConstraint();
//                securityConstraint.setUserConstraint("CONFIDENTIAL");
//                SecurityCollection collection = new SecurityCollection();
//                collection.addPattern("/*");
//                securityConstraint.addCollection(collection);
//                context.addConstraint(securityConstraint);
//            }
//        };
//
//        tomcat.addAdditionalTomcatConnectors(initiateHttpConnector());
//        return tomcat;
//    }

//    //HTTPS Support
//    private Connector initiateHttpConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        connector.setPort(8080);
//        connector.setSecure(false);
//        connector.setRedirectPort(8081);
//
//        return connector;
//    }

//Dependency Injection
    @Autowired
    private FirstSpring fs;

    public static void main(String[] args) {
        System.out.println("ALL GOOD!");
//SpringBoot app
        SpringApplication.run(Main.class, args);

    }

    //SpringBoot App
    @Override
    public void run(String... args)
    {
        fs.showBarAccess();fs.showBarAccess();fs.showBarAccess();
    }

    @RequestMapping(value="/{firstName}/{lastName}",method = RequestMethod.GET)
    public String hello( @PathVariable("firstName") String firstName,
                         @PathVariable("lastName") String lastName) {

        return String.format("{\"message\":\"Hello %s %s\"}", firstName, lastName);
    }
//
//    @RequestMapping("/")
//    public String  defaultPage() {
//
//        return "<h1>HELLO GREAT WORLD!</h1>" +
//                //Live reload support on web pages
//                "<a href src=\"https://github.com/guard/guard-livereload\"></a>" +
//                "";
//    }
}


