package org.example.homework;

public abstract class Fruit {
    /**
     * @param name - Переменная содержит тип фрукта.
     */
    private String name;

    /**
     * @param weightFruit - Переменная содержит вес фрукта.
     */
    private float weightFruit;


    public String getName() {
        return name;
    }

    public float getWeightFruit() {
        return weightFruit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weightFruit = weight;
    }

    @Override
    public String toString() {
        return String.format("%s вес:%.1f", getName(), getWeightFruit());
    }
}
