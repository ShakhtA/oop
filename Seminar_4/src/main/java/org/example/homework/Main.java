package org.example.homework;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> appleBox2 = new Box<>();
        int size1 = r.nextInt(20) + 1;
        int size2 = r.nextInt(20) + 1;
        for (int i = 0; i < size1; i++){
            appleBox1.addFruit(new Apple());
        }
        for (int i = 0; i < size2; i++){
            appleBox2.addFruit(new Orange());
        }
        System.out.println(size1 + " и " + size2);
        float weightBox1 = appleBox1.getWeight();
        float weightBox2 = appleBox2.getWeight();
        System.out.println(weightBox1 + " и " + weightBox2);
        System.out.println(appleBox1.compare(appleBox2));

        //appleBox1.movementFruit(appleBox2);
        //appleBox1.moveFruit(appleBox2);
        System.out.println(appleBox1.getFruitsList().size() + " и " + appleBox2.getFruitsList().size());
    }
}