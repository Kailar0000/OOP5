package views;

import models.DateReservation;
import models.Reservation;
import models.Table;
import presenters.View;
import presenters.ViewObserver;

import java.util.Collection;

public class BookingView implements View {

    private ViewObserver observer;



    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;

    }

    public void showTables(Collection<Table>tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    public void reservationTable(DateReservation orderDate, int tableId, String name){
        observer.onReservationTable(orderDate,tableId,name);
    }

    @Override
    public void showReservationStatus(int reservationId) {
        if(reservationId > 0){
            System.out.printf("Ваш столик успешно забронирован. Номер брони: #%d\n",reservationId);
        }
        else {
            System.out.println("Ошибка бронирования");
        }
    }

    @Override
    public void reservationTablesOfData(DateReservation reservationDate) {
        observer.reservationTablesOfData(reservationDate);
    }

    public void canselReservation(int reservationId){
        observer.canselReservationTable(reservationId);
    }
}
