package com.rajiv.java8;

public class SayableInstanceMethodReference {

    public void saySomething() {
        System.out.println("Hello, this is a non-static method");
    }

    public static void main(String[] args) {
        SayableInstanceMethodReference sayableInstanceMethodReference = new SayableInstanceMethodReference();

        Sayable sayable = sayableInstanceMethodReference::saySomething;

        sayable.say();
    }

    public void sayMethodByMethodReference() {
        Sayable sayable = new SayableInstanceMethodReference()::saySomething;

        sayable.say();
    }
}
