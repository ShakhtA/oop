package ru.geekbrains.lesson5.models;

import ru.geekbrains.lesson5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получить список всех столиков в ресторане
     *
     * @return список столиков
     */
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;

    }

    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : loadTables()) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }


    /**
     * TODO: Необходимо разработать самостоятельно в рамках домашней работы.
     * Отмена старой брони по номеру. Резервирование столика на новую дату и время.
     *
     * @param oldReservationNo
     * @param reservationDate
     * @param tableNo
     * @param name
     * @return новый номер брони
     */
    public int changeReservationTable(int oldReservationNo, Date reservationDate, int tableNo, String name) {
        for (Table table : loadTables()) {
            Collection<Reservation> reservationsCurrentTable = table.getReservations();
            Iterator<Reservation> iterator = reservationsCurrentTable.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getId() == oldReservationNo) {
                    iterator.remove();
                    break;
                }
            }
        }
        return reservationTable(reservationDate, tableNo, name);
    }
}
