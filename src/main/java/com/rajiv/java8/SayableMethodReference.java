package com.rajiv.java8;

public class SayableMethodReference {

    public static void saySomething() {
        System.out.println("Hello, this is a static method");
    }

    public static void main(String[] args) {
        Sayable sayable = SayableMethodReference::saySomething;

        sayable.say();
    }
}
