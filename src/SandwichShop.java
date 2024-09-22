import java.util.Scanner;

/**
 * A program that allows users to order food from a menu and provides the total cost of the order
 * and the estimated pick up time. 
 * 
 * @author Josh Yale
 */
public class SandwichShop {
    
    /**  Maximum number of minutes allowed */
   
    public static final int MAX_MINUTES = 59;
   
    /**  The number of minutes in an hour */
   
    public static final int MINUTES_IN_HOUR = 60;

    /** The number 11, used to determine valid order time */
   
    public static final int SHOP_OPEN_HOUR = 11;

    /** The number value of the month of November */

    public static final int NOVEMBER = 11;
    
    /** The number 6, used to determine valid order time */

    public static final int SHOP_CLOSE_HOUR = 6;

    /** The number 31, the total number of days in Oct and Dec */
    
    public static final int MAX_DAYS_DEC = 31;

    /** Represents the first day in October that the shop is open */
    
    public static final int FIRST_DAY = 15;

    /** The total number of days in November */

    public static final int MAX_DAYS_NOV = 30;

    /** The number value of the month of December */

    public static final int DECEMBER = 12;
    
    /** The number value of the months in a year*/

    public static final int MONTHS_IN_YEAR = 12;
    
    /** The number value of 12PM or Noon */

    public static final int NOON = 12;

    /** The number value of the month of October */

    public static final int OCTOBER = 10;

    /** The min number of minutes before minutes becomes two digits  */

    public static final int MIN_TEN_MINUTES = 10;

    /** Represents the current year */
   
    public static final int CURRENT_YEAR = 2024;

    /** The number 4, used to determine if a date is on a weekday */

    public static final int LEAP_YEAR_FREQUENCY = 4;

    /** The number 100, used to determine if a date is on a weekday */

    public static final int CENTURY = 100;

    /** The number 400, used to determine if a date is on a weekday */

    public static final int FOUR_CENTURIES = 400;

    /** The number 7, used to determine if a date is on a weekday */

    public static final int DAYS_IN_WEEK = 7;

    /** Represents the cost of one chicken supreme */

    public static final int CHICKEN_COST = 525;
    
    /** Represents the cost of one burger bonanza */
    
    public static final int BURGER_COST = 550;

    /** Represents the cost of one veggie delite */
    
    public static final int VEGGIE_COST = 495;

    /** Represents the cost of one water */
    
    public static final int WATER_COST = 150;

    /** Represents the cost of one coffee */
    
    public static final int COFFEE_COST = 195;

    /** The number of cents in a dollar */

    public static final int HUNDRED_CENTS = 100;

    /** Represents the cost of one chocolate shake */
    
    public static final int SHAKE_COST = 355;

    /** Estimated wait on weekdays */

    public static final int WEEKDAY_WAIT = 20;

    /** Estimated wait on weekends */

    public static final int WEEKEND_WAIT = 30;

    /**
     * The main method that is executed when the program is run
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("                 Welcome to the Wolfpack Sandwich Shop!");
        System.out.println("Orders must be placed betweem 11:00 AM " + 
                            "and 6:59 PM on Oct 15 - Dec 31.");
        System.out.println("When prompted, please enter the time and date. " + 
                            "You will then be asked to\nenter the number of each " + 
                            "sandwich/beverage you would like to purchase -");
        System.out.println("Chicken Supreme, Burger Bonanza, Veggie Delite, " +  
                            "Water, Coffee, Chocolate\nShake. Your order cost and " +
                            "estimated pickup time will then be output.");
        System.out.println("\nPlease enter time (hour min, e.g. 4 59): ");
        @SuppressWarnings("resource")
        Scanner scnr = new Scanner(System.in);
        int hour = scnr.nextInt();
        int min = scnr.nextInt();
        if (isValidTime(hour, min) == false) {
            System.out.println("Invalid time");
            return;
        }
        System.out.println("Please enter date (month day, e.g. 12 15): ");
        int month = scnr.nextInt();
        int day = scnr.nextInt();
        if (isValidDate(month, day) == false) {
            System.out.println("Invalid date");
            return;
        }
        System.out.println("\nPlease enter the number of each sandwhich/" + 
                            "beverage that you would like to purchase: ");
        System.out.println("Chicken Supreme: ");
        int chicken = scnr.nextInt();
        if (chicken < 0) {
            System.out.println("Invalid amount");
            return;
        }
        System.out.println("Burger Bonanza: ");
        int burger = scnr.nextInt();
        if (burger < 0) {
            System.out.println("Invalid amount");
            return;
        }
        System.out.println("Veggie Delite: ");
        int veggie = scnr.nextInt();
        if (veggie < 0) {
            System.out.println("Invalid amount");
            return;
        }
        System.out.println("Water: ");
        int water = scnr.nextInt();
        if (water < 0) {
            System.out.println("Invalid amount");
            return;
        }
        System.out.println("Coffee: ");
        int coffee = scnr.nextInt();
        if (coffee < 0) {
            System.out.println("Invalid amount");
            return;
        }
        System.out.println("Chocolate Shake: ");
        int shake = scnr.nextInt();
        if (shake < 0) {
            System.out.println("Invalid amount");
            return;
        }
        int totalCents = getOrderCost(chicken, burger, veggie, water, coffee, shake);
        int dollars = totalCents / HUNDRED_CENTS; 
        int cents = totalCents % HUNDRED_CENTS;
        if (totalCents == 0) {
            System.out.println("\nCost of Order: $0.00");
            return;
        }
        else {
            System.out.println("\nCost of Order: $" + dollars + "." + cents);
        }
        System.out.println("\nEstimated Pickup Time: " + getPickupTime(month, day, hour, min));
    }  
    /**
     * This method determines if the time entered is valid
     * 
     * @param hour takes in the hour the order was placed
     * @param min takes in the minute the order was placed
     * 
     * @return true or false 
     */

    public static boolean isValidTime(int hour, int min) {
        if ((hour >= SHOP_OPEN_HOUR && hour <= NOON) || 
            (hour >= 1 && hour <= SHOP_CLOSE_HOUR)) {
            return (min >= 0 && min <= MAX_MINUTES);
        }
        else {
            return false;
        }
    }
    /**
     * Method determines if date entered falls betweeen Oct 15 and Dec 31 inclusive
     * 
     * @param month takes in the month the order was placed
     * @param day takes in the day the order was placed
     * 
     * @return true or false 
     */

    public static boolean isValidDate(int month, int day) {
        if (month == OCTOBER) {
            return (day >= FIRST_DAY && day <= MAX_DAYS_DEC); 
        }
        else if (month == NOVEMBER) {
            return (day >= 1 && day <= MAX_DAYS_NOV);
        }
        else if (month == DECEMBER) {
            return (day >= 1 && day <= MAX_DAYS_DEC); 
        }
        else {
            return false;
        }
    }
    /**
     * Method determines if date entered is a weekday
     * 
     * @param month takes in the month the order was placed
     * @param day takes in the day the order was placed
     * 
     * @return true or false
     * @throws IllegalArgumentException if date is not between Oct 15 and Dec 31 inclusive. 
     * Message: Invalid date
     */

    public static boolean isWeekday(int month, int day) {
        if (isValidDate(month, day) == false) {
            throw new IllegalArgumentException("Invalid date"); 
        }
        int m = month;
        int d = day;
        int y = CURRENT_YEAR;
        int w = y - ((MONTHS_IN_YEAR + 2) - m) / MONTHS_IN_YEAR;
        int x = w + w / LEAP_YEAR_FREQUENCY - w / CENTURY + w / FOUR_CENTURIES;
        int z = m + MONTHS_IN_YEAR * (((MONTHS_IN_YEAR + 2) - m) / MONTHS_IN_YEAR) - 2;
        int dayOfWeek = (d + x + (MAX_DAYS_DEC * z) / MONTHS_IN_YEAR) % DAYS_IN_WEEK;
        
        if (dayOfWeek >= 1 && dayOfWeek <= LEAP_YEAR_FREQUENCY) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Method determines the cost of the order
     * 
     * @param chicken takes in the number of chicken supremes ordered
     * @param burger takes in the number of burger bonanzas ordered
     * @param veggie takes in the number of veggie delites ordered
     * @param water takes in the number of waters ordered
     * @param coffee takes in the number of coffees ordered
     * @param shake takes in the number of chocolate shakes ordered
     * 
     * @return the total cost of the order in cents
     * @throws IllegalArgumentException if any input is negative. 
     * Message: Invalid amount
     */
  
    public static int getOrderCost(int chicken, int burger, 
                    int veggie, int water, int coffee, int shake) {
        if (chicken < 0 || burger < 0 || veggie < 0 || water < 0 || coffee < 0 || shake < 0) {
            throw new IllegalArgumentException("Invalid amount");
        }                    
        int totalCost = (chicken * CHICKEN_COST) + (burger * BURGER_COST) + (veggie * VEGGIE_COST)
             + (water * WATER_COST) + (coffee * COFFEE_COST) + (shake * SHAKE_COST);
        return totalCost;
    }
    /**
     * Method calculates the estimated pickup time
     * 
     * @param month takes in the month the order was placed
     * @param day takes in the day the order was placed
     * @param hour takes in the hour the order was placed
     * @param min takes in the minute the order was placed
     * 
     * @return estimated pickup time
     * @throws IllegalArgumentException if date entered is invalid
     * Message: Invalid date
     * @throws IllegalArgumentException if time entered is invalid
     * Message: Invalid time
     */

    public static String getPickupTime(int month, int day, int hour, int min) {
        if (isValidDate(month, day) == false) {
            throw new IllegalArgumentException("Invalid date");
        }    
        if (isValidTime(hour, min) == false) {
            throw new IllegalArgumentException("Invalid time");
        }
        if (isWeekday(month, day)) {
            min = min + WEEKDAY_WAIT;
        }
        else {
            min = min + WEEKEND_WAIT;
        }
        if (min > MAX_MINUTES) {
            hour = hour + 1;
            min = min % MINUTES_IN_HOUR;
        }
        if (hour > NOON) {
            hour = hour % NOON;
        }
        String minute;
        if (min < MIN_TEN_MINUTES) {
            minute = "0" + min;
        }
        else {
            minute = String.valueOf(min);
        }

        return hour + ":" + minute;
    }
}