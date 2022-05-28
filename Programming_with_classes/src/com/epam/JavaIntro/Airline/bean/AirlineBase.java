package com.epam.JavaIntro.Airline.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirlineBase {

    private ArrayList<Airline> base;

public AirlineBase() {
        this.base = new ArrayList<>();
}

    public AirlineBase(ArrayList<Airline> base) {
        this.base = base;
    }

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

    public ArrayList<Airline> getBase() {
        return base;
    }

    public void setBase(ArrayList<Airline> base) {
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirlineBase)) return false;
        AirlineBase that = (AirlineBase) o;
        return Objects.equals(getBase(), that.getBase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBase());
    }

    @Override
    public String toString() {
        return "AirlineBase{" +
                "base=" + base +
                '}';
    }
}
