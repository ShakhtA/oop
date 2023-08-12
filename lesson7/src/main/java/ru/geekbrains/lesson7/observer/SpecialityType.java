package ru.geekbrains.lesson7.observer;

import java.util.Random;

public enum SpecialityType {
    Programmer,
    Tester,
    Analyst,
    ProductManager,
    ProjectManager;

    /**
     * Метод, позволяющий случайным методом получить специальность из перечисления
     * @return спецальность
     */
    public static SpecialityType randomSpeciality() {
        Random random = new Random();
        SpecialityType[] specialityTypes = SpecialityType.values();
        return specialityTypes[random.nextInt(specialityTypes.length)];
    }
}
