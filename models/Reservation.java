package models;

import java.util.Date;

public class Reservation {
    private static int counter;
    private final int id;
    private DateReservation date;
    private String name;
    {
        id = ++counter;
    }
    public int getId() {
        return id;
    }

    public DateReservation getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Reservation(DateReservation date, String name) {
        this.date = date;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("id# %-4d| %s |Резерв на имя: %s",id,date,name);
    }
}