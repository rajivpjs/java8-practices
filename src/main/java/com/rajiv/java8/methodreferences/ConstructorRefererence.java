package com.rajiv.java8.methodreferences;

import com.rajiv.java8.Messagable;

public class ConstructorRefererence {

    public static void main(String[] args) {
        Messagable messagable = Message::new;
        messagable.getMessage("Hello");
    }
}
