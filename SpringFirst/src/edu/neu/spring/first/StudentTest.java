package edu.neu.spring.first;

import javafx.application.Application;
import org.aopalliance.aop.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})


public class StudentTest {
    @Autowired
    Student student;

    @Autowired
    MyClass myClass;

    @Test
    public void testClass() {
        myClass.student.sayHello();
//        Logger logger = Logger.getLogger(Advice,)
    }
    @Test
    public void sayHello1() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        Student student = (Student) context.getBean("student");
                student.sayHello();
    }

}