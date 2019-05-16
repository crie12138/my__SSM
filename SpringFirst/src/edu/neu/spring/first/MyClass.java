package edu.neu.spring.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyClass {
    @Autowired
    Student student;

    public void classHello(){
        System.out.println("start,,,");
    }

}
