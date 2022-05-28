package com.epam.JavaIntro.Airline.bean;

import java.util.Objects;

public class Airline {
    {
        startId++;
    }
    private static int startId = 0;
    private int id = startId;

private String destination;
private String flightNumber;
private String aircraftType;
private double departureTime;
private String dayWeek;

    public Airline() {
    }

    public Airline(String destination, String flightNumber, String aircraftType, double departureTime, String dayWeek) {
    this.destination = destination;
    this.flightNumber = flightNumber;
    this.aircraftType = aircraftType;
    this.departureTime = departureTime;
    this.dayWeek = dayWeek;
}

    public String toSting(){
        String string = "";
        string = string + "Id: " + id + "\n Пункт назначения: " + destination + "\n Номер рейса: " + flightNumber +
                "\n Тип самолета: " + aircraftType + "\n Время вылета: " + departureTime + "\n День недели: " + dayWeek;
        return string;
    }

    public void print(){
        System.out.println(toSting());
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public void setDayWeek(String dayWeek) {
        this.dayWeek = dayWeek;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public String getDayWeek() {
        return dayWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airline)) return false;
        Airline airline = (Airline) o;
        return id == airline.id && Double.compare(airline.getDepartureTime(), getDepartureTime()) == 0 && Objects.equals(getDestination(), airline.getDestination()) && Objects.equals(getFlightNumber(), airline.getFlightNumber()) && Objects.equals(getAircraftType(), airline.getAircraftType()) && Objects.equals(getDayWeek(), airline.getDayWeek());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getDestination(), getFlightNumber(), getAircraftType(), getDepartureTime(), getDayWeek());
    }
}
