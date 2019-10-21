package org.ven.springlearning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

@Component
public class FirstSpring {

    //Dependency Injection
    //Spring Events
    @Autowired
    SpringEventPublisher pub;

    //Dependency Injection
    //Spring Events
    @Autowired
    SpringEventListener lis;


    public void showBarAccess()
    {
        //Spring Event PUB SUB call
        pub.doStuffAndPublishAnEvent("hello");

        System.out.println(myFoo.getBar());

        //Maven Resource in classpath..
        try {
            //Maven resource in classpath..
            printFile( getFileFromResources("application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    // get file from classpath, resources folder
    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }

    private static void printFile(File file) throws IOException, IOException {

        if (file == null) return;

        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

//Dependency Injection with Qualifier
    @Autowired(required = true)
    @Qualifier("fooImpl2")
    IFoo myFoo;



}
