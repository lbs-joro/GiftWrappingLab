import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Part4Test {
    @Test
    void testCalculateMinPaperLength(){
        GiftWrapping calculator = new GiftWrapping();

        // Test 1: Valid input, minimum paper length needed
        double result1 = calculator.calculateMinPaperLength("4:5:6", 12.0);
        assertEquals(18.0, result1);

        // Test 2: Valid input, roll length too short for all dimensions
        double result2 = calculator.calculateMinPaperLength("4.0:5.0:6.0", 10.0);
        assertEquals(18.0, result2);

        // Test 3: Valid input, roll length not long enough
        double result3 = calculator.calculateMinPaperLength("4.0:5.0:6.0", 8.0);
        assertEquals(-1, result3);

//         Test 4: Valid input,
        double result4 = calculator.calculateMinPaperLength("10.0:5.0:3.0", 8.0);
        assertEquals(26, result4);

//        Test 5: Valid input, decminal dimensions
        double result5 = calculator.calculateMinPaperLength("10.5:4.9:2.2", 8.0);
        assertEquals(25.4, result5);

    }

    @Test
    void testCalculateMinPaperLengthInvalidInput(){
        GiftWrapping calculator = new GiftWrapping();

        // Test case 3: Too many dimensions
        String gift3 = "2:10:1:1";
        double expected3 = -1.0;
        assertEquals(expected3, calculator.calculateMinPaperArea(gift3), 0.001);
        // Test 4: Invalid input (not enough dimensions)
        double result4 = calculator.calculateMinPaperLength("4.0:5.0", 12.0);
        assertEquals(-1.0, result4);

        // Test 5: Invalid input (negative dimension)
        double result5 = calculator.calculateMinPaperLength("4.0:5.0:-6.0", 12.0);
        assertEquals(-1.0, result5);
    }
}
