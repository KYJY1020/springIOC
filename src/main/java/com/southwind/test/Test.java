package com.southwind.test;

import com.southwind.entity.Classes;
import com.southwind.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        //加载ioc容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
      System.out.println(applicationContext);
//      Student stu=(Student)applicationContext.getBean("stu");
//        //只能保证一个对象
//        Student stu=applicationContext.getBean(Student.class);
        Student stu2=(Student)applicationContext.getBean("stu2");
       System.out.println(stu2);
        Classes classes=(Classes)applicationContext.getBean("classes1");
System.out.println(classes);
    }
}
