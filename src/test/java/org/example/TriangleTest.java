package org.example;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class TriangleTest {

    static Logger logger = LoggerFactory.getLogger(TriangleTest.class);


    private static calTriArea cal = new calTriArea();

    @Test
    public void test2() {
        assertEquals(6.0, cal.cal(3,4,5),0.00001);
    }

    @Test
    public void test3() {
        assertEquals(3.89711431, cal.cal(3, 3, 3), 0.00001);
    }

    @Test
    public void test4() {
        assertEquals(-1.0, cal.cal(2, 1, 3), 0.00001);
    }

    @Test
    public void test5() {
        assertEquals(-1.0, cal.cal(-2, -1, -3), 0.00001);
    }
}