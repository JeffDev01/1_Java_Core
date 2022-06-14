package intermediate.Mdesignpatterns.singleton.test;

import intermediate.Mdesignpatterns.singleton.domain.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {


    public static void main(String[] args) {

        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat){
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINTANCE();
        System.out.println(aircraft);
        System.out.println(aircraft.bookSeat(seat));


    }
}
