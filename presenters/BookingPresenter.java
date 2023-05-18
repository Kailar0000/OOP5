package presenters;


import models.DateReservation;
import models.Reservation;
import models.Table;

import java.util.Collection;

public class BookingPresenter implements ViewObserver {
    private final Model model;
    private final View view;
    private Collection<Table>tables;
    public BookingPresenter(Model model,View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }


    public void loadTables(){
        if (tables == null){
            tables = model.loadTables();
        }
    }


    public void updateView() {
        view.showTables(tables);
    }


    private void updateReservationStatusView(int reservationId){
        view.showReservationStatus(reservationId);
    }


    @Override
    public void onReservationTable(DateReservation orderDate, int tableId, String name) {
        int reservationId = model.reservationTables(orderDate,tableId,name);
        updateReservationStatusView(reservationId);
    }



    @Override
    public void canselReservationTable(int reservationId) {
        model.canselReservation(reservationId);
    }

    @Override
    public void reservationTablesOfData(DateReservation reservationDate) {
        model.reservationTablesOfData(reservationDate);
    }


}
