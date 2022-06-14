package intermediate.Mdesignpatterns.singleton.test;

import intermediate.Mdesignpatterns.singleton.domain.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {


    public static void main(String[] args) {

        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
    }

    static void bookSeat(String seat){
        AircraftSingletonEnum aircraft = AircraftSingletonEnum.INSTANCE ;
        System.out.println(aircraft);
        System.out.println(aircraft.bookSeat(seat));


    }
}
