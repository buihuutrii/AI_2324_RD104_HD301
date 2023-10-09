package baitap_1_4;

public class TimePoint {
    private int hours;
    private int minutes;
    private int seconds;
    
    /**
     * this is constructor
     * example 
     * new TimePoint(1, 2, 3);
     * @param hours
     * @param minutes
     * @param seconds
     */
    public TimePoint(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}