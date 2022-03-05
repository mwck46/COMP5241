package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest 
{
    @Test
    public void testScalene() {
        Triangle t = new Triangle(3, 4, 5);
        assertEquals("Scalene", t.getTriangleType());
    }

    @Test
    public void testEquilateral() {
        Triangle t = new Triangle(3, 3, 3);
        assertEquals("Equilateral", t.getTriangleType());
    }    
}
