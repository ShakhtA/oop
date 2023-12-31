package ru.geekbrains.lesson5;

import ru.geekbrains.lesson5.models.Table;
import ru.geekbrains.lesson5.models.TableModel;
import ru.geekbrains.lesson5.presenters.BookingPresenter;
import ru.geekbrains.lesson5.presenters.Model;
import ru.geekbrains.lesson5.presenters.View;
import ru.geekbrains.lesson5.views.BookingView;

import java.util.ArrayList;
import java.util.Date;

public class Program {

    /**
     * TODO: Домашняя работа
     *  метод changeReservationTable должен заработать!!!
     * @param args
     */
    public static void main(String[] args) {

        View view = new BookingView();
        Model model = new TableModel();

        BookingPresenter bookingPresenter = new BookingPresenter(view, model);
        bookingPresenter.showTables();

        view.reservationTable(new Date(), 3, "Станислав");
        System.out.println(("==================="));
        view.reservationTable(new Date(), 1, "Евгений");
        System.out.println(("==================="));
        view.reservationTable(new Date(), 2, "Павел");
        System.out.println(("==================="));



        view.changeReservationTable(1001, new Date(), 4, "Станислав");

    }

}
