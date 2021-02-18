package org.tyaa.demo.java.testing.test;

import org.junit.jupiter.api.Test;
import org.tyaa.demo.java.testing.DemoClass;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoClassTest {
    @Test
    public void givenTwoAndTwoWhenMultiplyThenFour () {
        var result =
            DemoClass.multiply(2, 2);
        assertEquals(4, result);
    }
}
