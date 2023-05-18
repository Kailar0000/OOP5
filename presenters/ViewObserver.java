package presenters;

import models.DateReservation;
import models.Reservation;

import java.util.Date;

public interface ViewObserver {



    void onReservationTable(DateReservation orderDate, int table, String name);
    void canselReservationTable(int reservationId);
    void reservationTablesOfData(DateReservation reservationDate);

}
