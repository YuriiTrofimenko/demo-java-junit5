package org.tyaa.demo.java.testing.test;

import org.junit.jupiter.api.*;
import org.tyaa.demo.java.testing.DemoClass;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoClassTest {

    @BeforeAll
    public static void setup () {
        System.out.println("setup...");
    }

    @BeforeEach
    public void setupCase () {
        System.out.println("setup case...");
    }

    @Test
    public void givenTwoAndTwoWhenMultiplyThenFour () {
        var result =
            DemoClass.multiply(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void givenThreeAndThreeWhenMultiplyThenNine () {
        var result =
                DemoClass.multiply(3, 3);
        assertEquals(9, result);
    }

    @AfterEach
    public void tearDownCase () {
        System.out.println("exit case...");
    }

    @AfterAll
    public static void tearDown () {
        System.out.println("exit...");
    }
}
