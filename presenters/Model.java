package presenters;

import models.DateReservation;
import models.Reservation;
import models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();


    int reservationTables(DateReservation reservationDate, int tableId, String name);
    void canselReservation(int idReservationOld);
    void reservationTablesOfData(DateReservation reservationDate);

}