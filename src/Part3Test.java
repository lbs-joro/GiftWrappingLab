import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Part3Test {
    @Test
    void testCalculateMinPaperArea(){
        GiftWrapping calculator = new GiftWrapping();

        // Scenario 1: Valid Input - Minimum Paper Area
        String gift1 = "4.0:5.0:6.0";
        double result1 = calculator.calculateMinPaperArea(gift1);
        double expected1 = 148.0;
        assertEquals(expected1, result1);

        // Scenario 2: Valid Input - Smallest Possible Gift
        String gift2 = "1.0:1.0:1.0";
        double result2 = calculator.calculateMinPaperArea(gift2);
        double expected2 = 6.0;
        assertEquals(expected2, result2);

        // Scenario 5: Valid Input - All Dimensions Are Zero
        String gift5 = "0.0:0.0:0.0";
        double result5 = calculator.calculateMinPaperArea(gift5);
        double expected5 = 0.0;
        assertEquals(expected5, result5);

        // Scenario 6: Valid Input - Large Dimensions
        String gift6 = "1000.0:2000.0:3000.0";
        double result6 = calculator.calculateMinPaperArea(gift6);
        double expected6 = 22000000.0;
        assertEquals(expected6, result6);
    }

    @Test
    void testCalculateMinPaperAreaInValidInput() {
        GiftWrapping calculator = new GiftWrapping();

        // Test case 1: Negative dimensions
        String gift1 = "5:-3:4";
        double expected1 = -1.0;
        assertEquals(expected1, calculator.calculateMinPaperArea(gift1), 0.001);

        // Test case 2: Multiple Negative dimensions
        String gift2 = "-2:10:-4";
        double expected2 = -1.0;
        assertEquals(expected2, calculator.calculateMinPaperArea(gift2), 0.001);

        // Test case 3: All Negative dimensions
        String gift3 = "-10:-3:-4";
        double expected3 = -1.0;
        assertEquals(expected3, calculator.calculateMinPaperArea(gift3), 0.001);

        // Test case 4: Missing dimensions
        String gift4 = "2:3";
        double expected4 = -1.0;
        assertEquals(expected4, calculator.calculateMinPaperArea(gift4), 0.001);

        // Test case 5: Too many dimensions
        String gift5 = "2:10:1:1";
        double expected5 = -1.0;
        assertEquals(expected5, calculator.calculateMinPaperArea(gift5), 0.001);
    }
}
