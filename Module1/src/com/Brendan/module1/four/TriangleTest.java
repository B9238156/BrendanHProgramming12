package com.Brendan.module1.four;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TriangleTest {

    @Test public void testArea() {

        // Test a known area
        Triangle triangle = new Triangle(4, 3, 5, Colour.NONE);
        assertEquals(6, triangle.getArea(), 0.001);

        // Test with invalid sides
        triangle = new Triangle(0, 3, 5, Colour.NONE);
        assertEquals(-1, triangle.getArea(), 0.001);

    }

    @Test public void testHeight() {

        // Test a known height
        Triangle triangle = new Triangle(4, 5, 3, Colour.NONE);
        assertEquals(4, triangle.getHeight(), 0.001);

        // Test with invalid sides
        triangle = new Triangle(0, 3, 5, Colour.NONE);
        assertEquals(-1, triangle.getArea(), 0.001);

    }

}