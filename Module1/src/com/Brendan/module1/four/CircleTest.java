package com.Brendan.module1.four;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test public void testArea(){
        Circle circle = new Circle(1, Colour.NONE);
        // If the radius is one, then the area should be pie because the radius is Pi r squared.
        assertEquals(Math.PI, circle.getArea(), 0.001);

        //Test for invalid radius
        circle = new Circle(0, Colour.NONE);
        assertEquals(-1, circle.getArea(), 0.001);
    }

}