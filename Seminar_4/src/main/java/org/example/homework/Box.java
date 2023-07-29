package org.example.homework;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitsList = new ArrayList<>();

    public Box() {
        fruitsList = new ArrayList<>();
    }

    /**
     * Метод, возвращающий список фруктов.
     */
    public List<T> getFruitsList() {
        return fruitsList;
    }

    /**
     * Метод, добавляющий фрукт в коробку
     * @param fruit
     */
    public void addFruit(T fruit) {
        fruitsList.add(fruit);
    }

    /**
     * Метод, вычисляющий вес коробки
     * @return возращается вес коробки
     * @param <T> тип фрукта, хранящийся в коробке
     */
    public <T> float getWeight() {
        return fruitsList.size() * fruitsList.get(0).getWeightFruit();
    }

    /**
     * Метод, сравнивающий массу текущей корбки с коробкой, переданной в параметре
     * @param box - корзина, с которой сравнивается текущая коробка
     * @return метод возвращает true, если массы коробок одинаковы, и false - если массы разные
     */
    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    /**
     * Метод, перемещающий фрукты из одной коробки в другую
     * @param box - коробка, в которую добавляются фрукты из текущей коробки
     */
    public void movementFruit (Box<T> box) {
        while (!fruitsList.isEmpty()) {
            box.addFruit(this.fruitsList.get(0));
            fruitsList.remove(0);
        }
    }

    /**
     * Метод, перемещающий фрукты из одной коробки в другую
     * @param box - коробка, в которую добавляются фрукты из текущей коробки
     */
    public void moveFruit(Box<T> box) {
        box.fruitsList.addAll(this.fruitsList);
        fruitsList.clear();
    }
}
