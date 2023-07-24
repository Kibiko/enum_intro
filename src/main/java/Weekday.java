public enum Weekday {

    MONDAY("Monntag"),
    TUESDAY("Dienstag"),
    WEDNESDAY("Mittwoch"),
    THURSDAY("Donnerstag"),
    FRIDAY("Freitag"),
    SATURDAY("Samstag"),
    SUNDAY("Sonntag");

    private final String german;

    Weekday(String german){
        this.german = german;
    }

    public String getGermanWeekday(){
        return this.german;
    }
}
