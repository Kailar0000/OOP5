package presenters;

import models.DateReservation;
import models.Table;

import java.util.Collection;

public interface View {

    void showTables(Collection<Table> tables);


    void setObserver(ViewObserver observer);

    void showReservationStatus(int reservationId);
    void reservationTablesOfData(DateReservation reservationDate);
}
