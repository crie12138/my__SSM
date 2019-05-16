package edu.neu.spring.first;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public void  sayHello(){
        System.out.println("你好，我是学生！");
    }
}
