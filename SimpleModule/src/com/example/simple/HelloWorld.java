package com.example.simple;

// A simple class to demonstrate module usage
public class HelloWorld {

    public void sayHello() {
        System.out.println("Hello from the module!");
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.sayHello();
    }
}