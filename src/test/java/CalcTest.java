import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {


    @Test
    public void testAdd() {
        int expectedAddResult = 10;
        assertEquals(expectedAddResult, Calc.add(8,2));
    }

    public void testSubtract() {
        int expectedSubtractResult = 6;
        assertEquals(expectedSubtractResult, Calc.subtract(8,2));
    }
}
