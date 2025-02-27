import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SumNumbersTest {

    @Test
    public void testSumIsEven_S1() {
        int a = 1;
        int b = 1;
        int result = 1;

        SumNumbers sumCalculator = new SumNumbers();
        int actualResult = sumCalculator.sumIsEven(a, b);

        assertEquals(result, actualResult);

    }


    @Test
    public void testSumIsEven_S2() {
        int a = 1;
        int b = 2;
        int result = 0;

        SumNumbers sumCalculator = new SumNumbers();
        int actualResult = sumCalculator.sumIsEven(a, b);

        assertEquals(result, actualResult);
    }
}
