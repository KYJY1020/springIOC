package com.southwind.entity;

public class Car {
    private Integer id;
    private String brand;
    public Car(){
        System.out.println("创建了car 对象");



    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
