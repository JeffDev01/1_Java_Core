package intermediate.Mdesignpatterns.singleton.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    //Eager initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("788-890");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
    public static AircraftSingletonEager getINTANCE(){
        return INSTANCE;
    }

}
