package com.example;
import static org.junit.Assert.*;
import org.junit.*;

public class MathTest {
    static Math m;

    @BeforeClass
    //run once before all test cases start running
    public static void setup(){
        m = new Math();
    }
    
    @Test
    public void canAdd() {
        assertEquals(3, m.add(1, 2));
    }

    @Test
    public void canDivide() { 
        assertEquals(3, m.divide(6, 2), 0.01); //delta=0.01
    }

    @Test
    public void canMultiply() {
        assertEquals(6, m.multiply(2, 3));
    }

    @Test
    public void canSubstract() {
        assertEquals(1, m.substract(2, 1));
    }
}
