package Airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineBase {
    private ArrayList<Airline> base = new ArrayList<>();

    public void addAirlineBase(Airline airline) {
        base.add(airline);
    }

    List<Airline> destinations(String destination) {
        List<Airline> destinations = new ArrayList<>();
        for (Airline b: base) {
            if (b.getDestination().equals(destination)) {
                destinations.add(b);
            }
        }
        return destinations;
    }

    List<Airline> days(String dayWeek) {
        List<Airline> days = new ArrayList<>();
        for (Airline b: base) {
            if (b.getDayWeek().equals(dayWeek)) {
                days.add(b);
            }
        }
        return days;

    }

    List<Airline> daysAndTime(String dayWeek, double departureTime) {
        List<Airline> days2 = new ArrayList<>();
        for (Airline b: base) {
            if (b.getDayWeek().equals(dayWeek) && b.getDepartureTime() > departureTime) {
                    days2.add(b);
                }
            }
        return days2;
    }
}
