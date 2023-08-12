package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Агенство занимается поиском сотрудников
 */
public class JobAgency implements Publisher {

    /**
     * Агенство по поиску работы
     */

    /**
     * Список ищущих работу
     */
    List<Observer> observers = new ArrayList<>();

    /**
     * Рассылка вакансий соискателям
     * @param vacancy
     */
    @Override
    public void sendOffer(Vacancy vacancy) {
        for (Observer observer : observers){
            if (vacancy.getSpeciality() == ((JobSeeker) observer).getSpeciality())
                observer.receiveOffer(vacancy);
        }
    }

    /**
     * Регистрация нового соискателя
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Удаление соискателя
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        if (observer != null) {
            System.out.println("\n" + "=".repeat(20));
            System.out.printf("%s удален из списка, ищущих работу\n", ((JobSeeker) observer).getName());
            observers.remove(observer);
            System.out.println("\n" + "=".repeat(20));
            System.out.println("Список соискателей работы:");
            for (Observer observer1 : observers) {
                System.out.println(observer1);
            }
            //System.out.println("=".repeat(20) + "\n");
        }
    }
}
