package com.practice;

public class StaticDemo {
    // Static variable
    static int staticVar = 10;

    // Instance variable
    int instanceVar = 5;

    // Static block
    static {
        System.out.println("Static block is executed.");
        // You can perform static initialization tasks here if needed
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
        // You can access only static variables within a static method
        System.out.println("Static variable in static method: " + staticVar);
    }

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
        // You can access both static and instance variables within an instance method
        System.out.println("Static variable in instance method: " + staticVar);
        System.out.println("Instance variable in instance method: " + instanceVar);
    }

    public static void main(String[] args) {
        // Call the static method without creating an instance of the class
        StaticDemo.staticMethod();

        // Create an instance of the class to call the instance method
        StaticDemo obj = new StaticDemo();
        obj.instanceMethod();

        // Accessing the static variable using the class name or instance
        System.out.println("Accessing static variable using class name: " + StaticDemo.staticVar);
        System.out.println("Accessing static variable using instance: " + obj.staticVar);
    }
}
