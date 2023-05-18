package models;

import presenters.Model;

import java.util.ArrayList;
import java.util.Collection;

public class TableModel implements Model {

    private Collection<Table> tables;


    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }
    public void reservationTablesOfData(DateReservation reservationDate) {
        System.out.println("Резервы по вашему запросу: ");
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getDate().equals(reservation.getDate())) {
                    System.out.println(reservation);
                }
            }
        }
    }

    public int reservationTables(DateReservation reservationDate, int tableId, String name) {
        for (Table table : tables) {
            if (table.getId() == tableId) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Неверный номер столика");
    }


    public void canselReservation(int idReservationOld) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == idReservationOld) {
                    table.getReservations().remove(reservation);
                    System.out.printf("Ваш резерв #%d удален.\n",reservation.getId());
                    return;
                }
            }
        }
        throw new RuntimeException("Неверный номер резерва");
    }



}