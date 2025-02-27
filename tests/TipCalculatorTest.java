import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TipCalculatorTest {

    public static double calculateTip(double bill, double tipPercent) {

        return bill * (tipPercent / 100);
    }

    @Test
    public void testCalculateTip_S1() {
        double bill = 100.00;
        int tipPercent = 20;
        double tip = 20.00;

        double actualTip = calculateTip(bill, tipPercent);
        assertEquals(tip, actualTip, 0.01);
    }


    @Test
    public void testCalculateTip_S2() {
        double bill = 60.00;
        int tipPercent = 15;
        double tip = 9.00;

        double actualTip = calculateTip(bill, tipPercent);
        assertEquals(tip, actualTip, 0.01);
    }
}


