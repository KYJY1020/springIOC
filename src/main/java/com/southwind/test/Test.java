package com.southwind.test;

import com.southwind.entity.Classes;
import com.southwind.entity.Student;
import com.southwind.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        //加载ioc容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
      User user=(User)applicationContext.getBean("user");
      System.out.println(user);
      User user2=(User)applicationContext.getBean("user2");
      System.out.println(user2);
    }
}
