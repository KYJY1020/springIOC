package com.southwind.test;

import com.southwind.entity.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("factory.xml");
        Car car=(Car)applicationContext.getBean("car");
        System.out.println(car);
        Car car2=(Car)applicationContext.getBean("car2");
                System.out.println(car2);
    }
}
