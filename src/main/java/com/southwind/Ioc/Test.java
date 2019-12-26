package com.southwind.Ioc;

import com.southwind.entity.Student;

public class Test {
    public static void main(String[] args) {
        MyApplicationContext applicationContext=new MyClassPathXmlApplicationContext("spring.xml");
    Student student=(Student)applicationContext.getBean("student1");
     System.out.println(student);
    }

}
