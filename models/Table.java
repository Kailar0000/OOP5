package models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private final Collection<Reservation> reservations = new ArrayList<>();
    private static int counter;
    private final int id;
    {
        id = ++counter;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public int getId() {
        return id;
    }

    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }
    public void canselReservation(Reservation reservation){
        reservations.remove(reservation);
    }

    @Override
    public String toString() {
        return String.format("Столик #%d",id);
    }
}