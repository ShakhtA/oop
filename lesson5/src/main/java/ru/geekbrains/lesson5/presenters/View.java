package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    /**
     * Отображение списка столиков в приложении
     * @param tables
     */
    void showTables(Collection<Table> tables);

    /**
     * Метод позволяет установить наблюдателя, отслеживающего действия конечного пользователя
     * @param observer
     */
    void setObserver(ViewObserver observer);


    /**
     * Зарезервировать столик на дату
     * @param reservationDate дата
     * @param tableNo номер столика
     * @param name имя клиента
     */
    void reservationTable(Date reservationDate, int tableNo, String name);


    /**
     * Отобразить результат бронирования столика
     * @param reservationId номер брони
     */
    void showReservationTableResult(int reservationId);

    /**
     * Изменение брони столика
     * @param oldReservationTable
     * @param reservationDate
     * @param tableNo
     * @param name
     */
    void changeReservationTable(int oldReservationTable, Date reservationDate, int tableNo, String name);

    /**
     * Отобразить результат изменения брони столика
     * @param oldResevationId
     * @param newReservationId
     */
    void showChangeReservationTableResult(int oldResevationId, int newReservationId);
}
