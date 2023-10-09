package baitap_2_2;

public class MovieTheater {
    private static final double TICKET_PRICE = 5.0;
    private static final double PERFORMANCE_COST = 20.0;
    private static final double SERVICE_CHARGE_PER_ATTENDEE = 0.50;
    /**
     * this is method to consumes the number of attendees (of a show) and produces how
     * much income the attendees profit
     * example
     * totalProfit(40) return $160
     * @param numberOfAttendees
     * @return
     */
    public static double totalProfit(int numberOfAttendees) {
        double income = numberOfAttendees * TICKET_PRICE;
        double expenses = PERFORMANCE_COST + (numberOfAttendees * SERVICE_CHARGE_PER_ATTENDEE);
        double profit = income - expenses;
        
        return profit;
    }
    
   
}

