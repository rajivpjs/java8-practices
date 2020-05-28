package com.rajiv.java8;

public class ThreadMethodReference {

    public static void threadStatus() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(ThreadMethodReference::threadStatus);
        thread.start();
    }
}
