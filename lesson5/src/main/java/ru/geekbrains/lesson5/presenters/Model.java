package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    /**
     * Получить список всех столиков
     * @return
     */
    Collection<Table> loadTables();

    /**
     * Забронировать столик
     * @param reservationDate дата
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    /**
     * Отмена старой брони по номеру. Резервирование столика на новую дату и время.
     * @param oldReservationNo
     * @param reservationDate
     * @param tableNo
     * @param Name
     * @return новый номер брони
     */
    int changeReservationTable(int oldReservationNo, Date reservationDate, int tableNo, String Name);
}
