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

    @Test
    public void testIsosceles() {
        Triangle t = new Triangle(3, 3, 1);
        assertEquals("Isosceles", t.getTriangleType());

        Triangle t2 = new Triangle(1, 3, 3);
        assertEquals("Isosceles", t2.getTriangleType());

        Triangle t3 = new Triangle(3, 1, 3);
        assertEquals("Isosceles", t3.getTriangleType());
    }

    @Test
    public void testInvalideInput() {
        String expectedResult = "Error: The length should be positive";
        Triangle t = new Triangle(-1, 3, 3);
        assertEquals(expectedResult, t.getTriangleType());
        
        Triangle t2 = new Triangle(3, -1, 3);
        assertEquals(expectedResult, t2.getTriangleType());
        
        Triangle t3 = new Triangle(3, 3, -1);
        assertEquals(expectedResult, t3.getTriangleType());
    }  
    
    @Test
    public void testNotTriangle() {
        String expectedResult = "Error: Not a triangle";
        Triangle t = new Triangle(6, 3, 3);
        assertEquals(expectedResult, t.getTriangleType());
        
        Triangle t2 = new Triangle(3, 6, 3);
        assertEquals(expectedResult, t2.getTriangleType());
        
        Triangle t3 = new Triangle(3, 3, 6);
        assertEquals(expectedResult, t3.getTriangleType());
    } 
}
