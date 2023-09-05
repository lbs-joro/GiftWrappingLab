import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Part1Test {
    @Test
    void testCalculateMinRibbonLength() {
        GiftWrapping calculator = new GiftWrapping();

        // Test case 1: Equal dimensions
        String gift1 = "3:3:3";
        double expected1 = 18.0;
        assertEquals(expected1, calculator.calculateMinRibbonLength(gift1), 0.001);

        // Test case 2: Different dimensions
        String gift2 = "2:4:6";
        double expected2 = 24.0;
        assertEquals(expected2, calculator.calculateMinRibbonLength(gift2), 0.001);

        // Test case 3: Zero dimensions
        String gift3 = "0:0:0";
        double expected3 = 0.0;
        assertEquals(expected3, calculator.calculateMinRibbonLength(gift3), 0.001);

        // Test case 4: Large dimensions
        String gift4 = "1000:2000:3000";
        double expected4 = 12000.0;
        assertEquals(expected4, calculator.calculateMinRibbonLength(gift4), 0.001);

        // Test case 5: Decimal dimensions
        String gift5 = "1.2:3.5:4";
        double expected5 = 17.4;
        assertEquals(expected5, calculator.calculateMinRibbonLength(gift5), 0.001);
    }

    @Test
    void testCalculateMinRibbonLengthInValidInput() {
        GiftWrapping calculator = new GiftWrapping();

        // Test case 1: Negative dimensions
        String gift1 = "-2:3:4";
        double expected1 = -1.0;
        assertEquals(expected1, calculator.calculateMinRibbonLength(gift1), 0.001);

        // Test case 2: Multiple Negative dimensions
        String gift2 = "-2:-3:4";
        double expected2 = -1.0;
        assertEquals(expected2, calculator.calculateMinRibbonLength(gift2), 0.001);

        // Test case 3: All Negative dimensions
        String gift3 = "-2:-3:-4";
        double expected3 = -1.0;
        assertEquals(expected3, calculator.calculateMinRibbonLength(gift3), 0.001);

        // Test case 4: Missing dimensions
        String gift4 = "2:3";
        double expected4 = -1.0;
        assertEquals(expected4, calculator.calculateMinRibbonLength(gift4), 0.001);

        // Test case 5: Too many dimensions
        String gift5 = "2:3:1:1";
        double expected5 = -1.0;
        assertEquals(expected5, calculator.calculateMinRibbonLength(gift5), 0.001);
    }
}
