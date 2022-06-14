package intermediate.Mdesignpatterns.singleton.domain;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {

    private final Set<String> availableSeat = new HashSet<>();
    private final String name;

    {
        availableSeat.add("A1");
        availableSeat.add("A1");
    }

    public Aircraft(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat){
        return availableSeat.remove(seat);
    }

    public String getName() {
        return name;
    }
}
