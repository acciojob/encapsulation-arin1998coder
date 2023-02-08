package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        //rw.name="malvika"; //error : 'name' has private access in 'com.driver.RWOnly'
        //System.out.println(rw.name);
        rw.setName("Arin");
        System.out.println(rw.getName());
    }
}