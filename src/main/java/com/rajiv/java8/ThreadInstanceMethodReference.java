package com.rajiv.java8;

public class ThreadInstanceMethodReference {

    public void printMessage() {
        System.out.println("Hello, this is a instance method");
    }

    public static void main(String[] args) {
        ThreadInstanceMethodReference threadInstanceMethodReference = new ThreadInstanceMethodReference();
        Thread thread = new Thread(threadInstanceMethodReference::printMessage);
        thread.start();
    }
}
