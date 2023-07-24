public class Booking {

    private String name;
    private int weekNumber;
    private Weekday weekday; //now using the weekday enum
    // can include daytime as well

    public Booking(String name, int weekNumber, Weekday weekday){
        this.name = name;
        this.weekNumber = weekNumber;
        this.weekday = weekday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public Weekday getWeekday() {
        return weekday;
    }

    public void setWeekday(Weekday weekday) {
        this.weekday = weekday;
    }
}
