import ie.gmit.week2.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCalculator
{
    @Test
    public void testCalc()
    {
        Calculator Calc = new Calculator();
        double result = Calc.add(10, 50);
        assertEquals(60, result, 0);
    }
}
