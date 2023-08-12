package ru.geekbrains.lesson7.observer;

import java.util.Comparator;
import java.util.Random;

public abstract class JobSeeker implements Observer, Comparable<JobSeeker> {

    /**
     * Абстрактный класс соискателя вакансий
     */

    /**
     * Имя соискателя
     */
    protected String name;

    /**
     * Минимальная зарплата, на которую согласен соискатель
     */
    int salary;

    /**
     * Cпециальность соискателя
     */
    protected SpecialityType speciality;

    /**
     * Условные баллы, полученные по результатам собеседования
     */
    protected int raiting;

    /**
     * Конструктор класса
     * @param name
     */
    public JobSeeker(String name) {
        this.name = name;
        speciality = SpecialityType.randomSpeciality();
    }

    /**
     * Возвращает имя соискателя
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает тип специализации соискателя
     * @return
     */
    public SpecialityType getSpeciality() {
        return speciality;
    }

    /**
     * Обработка вакансии соискателем
     * @param vacancy - присланная агенством вакансия
     */
    public abstract void receiveOffer(Vacancy vacancy);

    /**
     * Установливает значение в поле rating после собеседования
     */
    public abstract void setRating();

    /**
     * Возвращает рейтинг
     * @return
     */
    public int getRaiting() {
        return raiting;
    }

    /**
     * Сравнение претендентов по рейтингу после собеседования
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(JobSeeker o) {
        return this.getRaiting() - o.getRaiting();
    }
}
