package com.rajiv.java8;

public class UnitTestFunctionalInterfaceImpl {

    public int method() {
        UnitTestFunctionalInterface unitTestFunctionalInterface = (int x, int y) -> x + y;
        return unitTestFunctionalInterface.operation(1, 3);
    }
}
