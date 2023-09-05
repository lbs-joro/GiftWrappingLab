import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Part2Test {
    @Test
    void testCalculateMinRibbonLengthWithPercentage() {
        GiftWrapping calculator = new GiftWrapping();

        // Test case 1: Increase percentage
        String gift1 = "3:3:3";
        double expected1 = 19.8;
        assertEquals(expected1, calculator.calculateMinRibbonLength(gift1, 10), 0.001);

        // Test case 2: zero percentage
        String gift2 = "2:4:6";
        double expected2 = 24.0;
        assertEquals(expected2, calculator.calculateMinRibbonLength(gift2, 0), 0.001);

        // Test case 3: Zero dimensions
        String gift3 = "0:0:0";
        double expected3 = 0.0;
        assertEquals(expected3, calculator.calculateMinRibbonLength(gift3,10), 0.001);

        // Test case 4: Large dimensions
        String gift4 = "1000:2000:3000";
        double expected4 = 13200.0;
        assertEquals(expected4, calculator.calculateMinRibbonLength(gift4,10), 0.001);

        // Test case 5: Decimal dimensions
        String gift5 = "1.2:3.5:4";
        double expected5 = 20.88;
        assertEquals(expected5, calculator.calculateMinRibbonLength(gift5, 20), 0.001);

        // Test case 6: 100 percentage decrease
        String gift6 = "2:4:6";
        double expected6 = 0;
        assertEquals(expected6, calculator.calculateMinRibbonLength(gift6, -100), 0.001);

        // Test case 7: zero percentage
        String gift7 = "2:4:6";
        double expected7 = 21.6;
        assertEquals(expected7, calculator.calculateMinRibbonLength(gift7, -10), 0.001);

    }

    @Test
    void testCalculateMinRibbonLengthWithPercentageInValidInput() {
        GiftWrapping calculator = new GiftWrapping();

        // Test case 1: Negative dimensions
        String gift1 = "-5:3:4";
        double expected1 = -1.0;
        assertEquals(expected1, calculator.calculateMinRibbonLength(gift1, 10), 0.001);

        // Test case 2: Multiple Negative dimensions
        String gift2 = "-2:-3:4";
        double expected2 = -1.0;
        assertEquals(expected2, calculator.calculateMinRibbonLength(gift2, 10), 0.001);

        // Test case 3: All Negative dimensions
        String gift3 = "-2:-3:-4";
        double expected3 = -1.0;
        assertEquals(expected3, calculator.calculateMinRibbonLength(gift3, 10), 0.001);

        // Test case 4: Missing dimensions
        String gift4 = "2:3";
        double expected4 = -1.0;
        assertEquals(expected4, calculator.calculateMinRibbonLength(gift4, 10), 0.001);

        // Test case 5: Too many dimensions
        String gift5 = "2:3:1:1";
        double expected5 = -1.0;
        assertEquals(expected5, calculator.calculateMinRibbonLength(gift5, 10), 0.001);

        // Test case 6: Negative dimensions with negative percentage
        String gift6 = "-2:3:4";
        double expected6 = -1.0;
        assertEquals(expected6, calculator.calculateMinRibbonLength(gift6, -10), 0.001);

        //Test case 7: Negative percentage:
        String gift7 = "2:3:4";
        double expected7 = -1.0;
        assertEquals(expected7, calculator.calculateMinRibbonLength(gift7, -110), 0.001);
    }
}
