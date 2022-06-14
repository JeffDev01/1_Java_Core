package intermediate.Mdesignpatterns.singleton.test;

import intermediate.Mdesignpatterns.singleton.domain.AircraftSingletonEager;
import intermediate.Mdesignpatterns.singleton.domain.AircraftSingletonLazy;

public class AircraftSingletonLazyTest01 {


    public static void main(String[] args) {

        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat){
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getINTANCE();
        System.out.println(aircraft);
        System.out.println(aircraft.bookSeat(seat));


    }
}
