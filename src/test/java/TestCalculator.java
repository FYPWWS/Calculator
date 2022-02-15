import ie.gmit.week2.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestCalculator
{
    Calculator calc;
    @BeforeEach
    void init()
    {
        calc = new Calculator();
    }
//    @Test
//    public void testAdd()
//    {
//        Calculator Calc = new Calculator();
//        double result = Calc.add(10, 50);
//        assertEquals(60, result, 0);
//    }
    @DisplayName("substract pass test")
    @Test
    public void testSub()
    {
       // assertEquals("hi", "hi");
       assertEquals(-10, calc.sub(10, 20));
    }

    @DisplayName("substract fail test nb1 out of range")
    @Test
    public void testSubFailNb1Neg()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->calc.sub(-10, 20));
        assertEquals("Invalid Input", e.getMessage());
    }


//    @Test
//    public void testMultiply()
//    {
//        Calculator Calc = new Calculator();
//        double result = Calc.mult(2, 2);
//        assertEquals(4, result, 0);
//    }
//
//    @Test
//    public void testDiv()
//    {
//        Calculator Calc = new Calculator();
//        double result = Calc.div(10, 2);
//        assertEquals(5, result, 0);
//    }
}
