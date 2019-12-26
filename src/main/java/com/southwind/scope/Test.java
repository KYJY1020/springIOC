package com.southwind.scope;

import com.southwind.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
       User user=(User) applicationContext.getBean("user");
       User user1=(User)applicationContext.getBean("user");
       System.out.println(user==user1);






    }

}
