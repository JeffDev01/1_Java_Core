package intermediate.Mdesignpatterns.singleton.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {
    //Eager initialization
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public static AircraftSingletonLazy getINTANCE() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("788-890");
                }
            }
        }
        return INSTANCE;
    }

}
