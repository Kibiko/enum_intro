public class Runner {

    public static void main(String[] args) {

        Booking booking = new Booking("Kevin",23,Weekday.MONDAY);

        System.out.println(booking.getWeekday());

//        System.out.println(Weekday.values()[3]);
//
        for(Weekday weekday : Weekday.values()){
            System.out.println(weekday.getGermanWeekday());
        }
//
//        Weekday today = Weekday.MONDAY;
//
//        if(today.equals(Weekday.MONDAY)){
//            System.out.println("Oh no, it's Monday!");
//        }


    }
}
