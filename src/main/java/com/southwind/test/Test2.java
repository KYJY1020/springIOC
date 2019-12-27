package com.southwind.test;

import com.southwind.entity.Car;
import com.southwind.factory.InstanceCarFactory;
import com.southwind.factory.StaticCarFactory;

public class Test2 {
    public static void main(String[] args) {
//        Car car= StaticCarFactory.getCar(1);
//        System.out.println(car);
        InstanceCarFactory carFactory=new InstanceCarFactory();
        Car car=carFactory.getCar(1);
        System.out.println(car);





    }

}
