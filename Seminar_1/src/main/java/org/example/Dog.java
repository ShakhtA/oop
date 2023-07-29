package org.example;

public class Dog extends Cat {
    public Dog(String name, String color, Integer age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("Гав гав!");
    }
}
