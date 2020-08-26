import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    @Test
    public void testAdd() {
        int expectedResult = 10;
        assertEquals(expectedResult, Calc.add(8,2));
    }
}
