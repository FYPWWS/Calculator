import ie.gmit.week2.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCalculator
{
    @Test
    public void testAdd()
    {
        Calculator Calc = new Calculator();
        double result = Calc.add(10, 50);
        assertEquals(60, result, 0);
    }

    @Test
    public void testSub()
    {
        Calculator Calc = new Calculator();
        double result = Calc.sub(40, 10);
        assertEquals(30, result, 0);
    }
}
