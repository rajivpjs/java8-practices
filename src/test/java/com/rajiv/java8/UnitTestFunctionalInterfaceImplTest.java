package com.rajiv.java8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTestFunctionalInterfaceImplTest {

    @Test
    public void testMethod() {
        UnitTestFunctionalInterfaceImpl unitTestFunctionalInterface = new UnitTestFunctionalInterfaceImpl();
        assertEquals(4, unitTestFunctionalInterface.method());
    }

}