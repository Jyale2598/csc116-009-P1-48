import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Program to test SandwichShop methods
 * @author Suzanne Balik
 * @author Michelle Glatz
 * @author Josh Yale
 */
public class SandwichShopTest {

  
    /**
     * Tests if a time in the afternoon is valid
     * Should return true
     */

    @Test
    public void testIsValidTimeAfternoonValid() {

        assertTrue(SandwichShop.isValidTime(2, 20), "SandwichShop.isValidTime(2, 20)");

    }

    /**
     * Tests if a time in the evening is invalid
     * Should return false
     */
    
    @Test
    public void testIsValidTimeEveningInvalid() {

        assertFalse(SandwichShop.isValidTime(7, 4), "SandwichShop.isValidTime(7, 4)");

    }

    /**
     * Tests if a time in the morning on the border of 11:00AM is valid
     * Should return true
     */

    @Test
    public void testIsValidTimeMorningBorderValid() {
        
        assertTrue(SandwichShop.isValidTime(11, 1), "SandwichShop.isValidTime(11, 1)");
        
    }

    /**
     * Tests if a time in the morning on the border of 11:00AM is invalid
     * Should return false
     */

    @Test
    public void testIsValidTimeMorningBorderInvalid() {
        
        assertFalse(SandwichShop.isValidTime(10, 59), "SandwichShop.isValidTime(10, 59)");
        
    }

     /**
     * Tests if a time with a negative minute value is valid
     * Should return false
     */
    
    @Test
    public void testIsValidTimeNegativeMinute() {
        
        assertFalse(SandwichShop.isValidTime(10, -30), "SandwichShop.isValidTime(10, -30)");

    }    
    
    /**
     * Tests if a date in October is valid
     * Should return true
     */

    @Test
    public void testIsValidDateOctoberValid() {

        assertTrue(SandwichShop.isValidDate(10, 20), "SandwichShop.isValidDate(10, 20)");

    }

    /**
     * Tests if a date in December is valid
     * Should return true
     */

    @Test
    public void testIsValidDateDecember() {

        assertTrue(SandwichShop.isValidDate(12, 4), "SandwichShop.isValidDate(12, 4)");

    }

    /**
     * Tests if a date in October is invalid
     * Should return false
     */

    @Test
    public void testIsValidDateOctoberInvalid() {
            
        assertFalse(SandwichShop.isValidDate(10, 34), "SandwichShop.isValidDate(10, 34)");

    }
    
    /**
     * Tests if a date in December close to the max days, 31, is valid
     * Should return true
     */

    @Test
    public void testIsValidDateDecemberBorderValid() {
        
        assertTrue(SandwichShop.isValidDate(12, 31), "SandwichShop.isValidDate(12, 31)");

    }

    /**
     * Tests if a date in November is invalid
     * Should return false
     */

    @Test
    public void testIsValidDateNovemberInvalidDay() {
        
        assertFalse(SandwichShop.isValidDate(11, 31), "SandwichShop.isValidDate(11, 31)");

    }    

    /**
     * Tests if a Thursday in December is valid
     * Should return true
     */

    @Test
    public void testIsWeekdayDecemberThursday() {

        assertTrue(SandwichShop.isWeekday(12, 5), "SandwichShop.isWeekday(12, 5)");

    }

    /**
     * Tests if a Saturday in October is a valid weekday
     * Should return false
     */

    @Test
    public void testIsWeekdayOctoberSaturday() {

        assertFalse(SandwichShop.isWeekday(10, 26), "SandwichShop.isWeekday(10, 26)");

    }

    /**
     * Tests if a Friday in November is a valid weekday
     * Should return false
     */

    @Test
    public void testIsWeekdayNovemberFriday() {
            
        assertFalse(SandwichShop.isWeekday(11, 15), "SandwichShop.isWeekday(11, 15)");

    }

    /**
     * Tests if a Monday in November is a valid weekday
     * Should return true
     */

    @Test
    public void testIsWeekdayNovemberMonday() {
        
        assertTrue(SandwichShop.isWeekday(11, 11), "SandwichShop.isWeekday(11, 11)");

    }

    /**
     * Tests if a Sunday in December is a valid weekday
     * Should return false
     */

    @Test
    public void testIsWeekdayDecemberSundayValid() {
        
        assertFalse(SandwichShop.isWeekday(12, 15), "SandwichShop.isWeekday(12, 15)");
    }    

    /**
     * Tests what the cost of one Chicken Supreme is 
     * Should return $5.25
     */

    @Test
    public void testGetOrderCostOneChicken() {
        assertEquals(525, SandwichShop.getOrderCost(1, 0, 0, 0, 0, 0),
                     "SandwichShop.getOrderCost(1, 0, 0, 0, 0, 0)");

    }

    /**
     * Tests what the cost of two Burger Bonanzas is 
     * Should return $11.00
     */

    @Test
    public void testGetOrderCostTwoBurgers() {
            
        assertEquals(1100, SandwichShop.getOrderCost(0, 2, 0, 0, 0, 0),
                    "SandwichShop.getOrderCost(0, 2, 0, 0, 0, 0)");

    }

    /**
     * Tests what the cost of one Veggie Delite and one water is 
     * Should return $6.45
     */

    @Test
    public void testGetOrderCostOneVeggieOneWater() {
        
        assertEquals(645, SandwichShop.getOrderCost(0, 0, 1, 1, 0, 0),
                     "SandwichShop.getOrderCost(0, 0, 1, 1, 0, 0)");

    }

    /**
     * Tests what the cost of three coffess is
     * Should return $5.85
     */

    @Test
    public void testGetOrderCostThreeCoffees() {
        
        assertEquals(585, SandwichShop.getOrderCost(0, 0, 0, 0, 3, 0),
                    "SandwichShop.getOrderCost(0, 0, 0, 0, 3, 0)");
    }    

    /**
     * Tests what the cost of one Chocolate Shake is
     * Should return $3.55
     */

    @Test
    public void testGetOrderCostOneShake() {
            
        assertEquals(355, SandwichShop.getOrderCost(0, 0, 0, 0, 0, 1),
                    "SandwichShop.getOrderCost(0, 0, 0, 0, 0, 1)");
    }

    /**
     * Tests what the cost of nothing is
     * Should return $0.00
     */

    @Test
    public void testGetOrderCostNothing() {
        
        assertEquals(0, SandwichShop.getOrderCost(0, 0, 0, 0, 0, 0),
                    "SandwichShop.getOrderCost(0, 0, 0, 0, 0, 0)");

    }
    
    /**
     * Tests what the cost of one order of everyting is
     * Should return $22.70
     */

    @Test
    public void testGetOrderCostOneOfEverything() {
        
        assertEquals(2270, SandwichShop.getOrderCost(1, 1, 1, 1, 1, 1),
                    "SandwichShop.getOrderCost(1, 1, 1, 1, 1, 1)");

    }    

    /**
     * Tests what estimated pickup time is for a time on a weekday evening
     * Should return 6:25
     */

    @Test
    public void testGetPickupTimeWeekdayEvening() {
        assertEquals("6:25", SandwichShop.getPickupTime(10, 23, 6, 5),
                     "SandwichShop.getDeliveryTime(10, 23, 6, 5)");

    }

    /**
     * Tests what estimated pickup time is on a weekday at the latest pickup time of 6:59
     * Should return 7:19
     */

    @Test
    public void testGetPickupTimeWeekdayLatestOrderTime() {
            
        assertEquals("7:19", SandwichShop.getPickupTime(10, 23, 6, 59),
                     "SandwichShop.getDeliveryTime(10, 23, 6, 59)");
    }

    /**
     * Tests what estimated pickup time is on a weekend at 12:30
     * Should return 1:00
     */

    @Test
    public void testGetPickupTimeWeekendTwelveThirtyOrderTime() {
        
        assertEquals("1:00", SandwichShop.getPickupTime(11, 9, 12, 30),
                     "SandwichShop.getDeliveryTime(11, 9, 12, 30)");

    }

    
    /**
     * Tests what estimated pickup time is on a weekend in the morning at 11:15
     * Should return 11:45
     */

    @Test
    public void testGetPickupTimeWeekendMorning() {
        
        assertEquals("11:45", SandwichShop.getPickupTime(11, 9, 11, 15),
                     "SandwichShop.getDeliveryTime(11, 9, 11, 15)");

    }    

    /**
     * Tests what estimated pickup time is on a weekday at 2:52
     * Should return 3:12
     */

    @Test
    public void testGetPickupTimeWeekdayTwoFiftyTwoOrderTime() {
            
        assertEquals("3:12", SandwichShop.getPickupTime(11, 12, 2, 52),
                     "SandwichShop.getDeliveryTime(11, 12, 2, 52)");

    }

    /**
     * Tests what estimated pickup time is on a weekend at 6:30
     * Should return 7:00
     */

    @Test
    public void testGetPickupTimeWeekendSixThirtyOrderTime() {
        
        assertEquals("7:00", SandwichShop.getPickupTime(11, 9, 6, 30),
                     "SandwichShop.getDeliveryTime(11, 9, 6, 30)");
    }
    

    /**
     * Test the SandwichShop methods with invalid values
     */
    @Test
    public void testInvalidMethods() {

        // Invalid test cases are provided for you below - You do NOT
        // need to add additional invalid tests. Just make sure these
        // pass!

        Exception exception = assertThrows(IllegalArgumentException.class,
            () -> SandwichShop.isWeekday(2, 27),
                                 "SandwichShop.isWeekday(2, 27)");
        assertEquals("Invalid date", exception.getMessage(),
                     "Testing SandwichShop.isWeekday(2, 27) - " +
                     "exception message");
        exception = assertThrows(IllegalArgumentException.class,
            () -> SandwichShop.getOrderCost(-1, 2, 3, 4, 0, 1),
                                           "SandwichShop.getOrderCost(-1, 2, 3, 4, 0, 1)");
        assertEquals("Invalid amount", exception.getMessage(),
                     "Testing SandwichShop.getOrderCost(-1, 2, 3, 4, 0, 1) - exception message");


        exception = assertThrows(IllegalArgumentException.class,
            () -> SandwichShop.getOrderCost(2, -2, 3, 4, 0, 1),
                                 "SandwichShop.getOrderCost(2, -2, 3, 4, 0, 1)");
        assertEquals("Invalid amount", exception.getMessage(),
                     "Testing SandwichShop.getOrderCost(2, -2, 3, 4, 0, 1) - exception message");


        exception = assertThrows(IllegalArgumentException.class,
            () -> SandwichShop.getOrderCost(0, 2, -3, 4, 0, 1),
                                 "SandwichShop.getOrderCost(0, 2, -3, 4, 0, 1)");
        assertEquals("Invalid amount", exception.getMessage(),
                     "Testing SandwichShop.getOrderCost(0, 2, -3, 4, 0, 1) - exception message");


        exception = assertThrows(IllegalArgumentException.class,
            () -> SandwichShop.getOrderCost(1, 2, 3, -3, 0, 1),
                                 "SandwichShop.getOrderCost(1, 2, 3, -3, 0, 1)");
        assertEquals("Invalid amount", exception.getMessage(),
                     "Testing SandwichShop.getOrderCost(1, 2, 3, -3, 0, 1) - " +
                     "exception message");


        exception = assertThrows(IllegalArgumentException.class,
            () -> SandwichShop.getOrderCost(1, 2, 3, 4, -1, 1),
                                 "SandwichShop.getOrderCost(1, 2, 3, 4, -1, 1)");
        assertEquals("Invalid amount", exception.getMessage(),
                     "Testing SandwichShop.getOrderCost(1, 2, 3, 4, -1, 1) - " +
                     "exception message");

        exception = assertThrows(IllegalArgumentException.class,
            () -> SandwichShop.getOrderCost(1, 2, 3, 4, 1, -3),
                                 "SandwichShop.getOrderCost(1, 2, 3, 4, 1, -3)");
        assertEquals("Invalid amount", exception.getMessage(),
                     "Testing SandwichShop.getOrderCost(1, 2, 3, 4, 1, -3) - " +
                     "exception message");

        exception = assertThrows(IllegalArgumentException.class,
            () -> SandwichShop.getPickupTime(1, 15, 3, 20),
                                 "SandwichShop.getPickupTime(1, 15, 3, 20)");
        assertEquals("Invalid date", exception.getMessage(),
                     "Testing SandwichShop.getPickupTime(1, 15, 3, 20) - " +
                     "exception message");

        exception = assertThrows(IllegalArgumentException.class,
            () -> SandwichShop.getPickupTime(11, 10, 8, 30),
                                 "SandwichShop.getPickupTime(11, 10, 8, 30)");
        assertEquals("Invalid time", exception.getMessage(),
                     "Testing SandwichShop.getPickupTime(11, 10, 8, 30) - " +
                     "exception message");


    }
}