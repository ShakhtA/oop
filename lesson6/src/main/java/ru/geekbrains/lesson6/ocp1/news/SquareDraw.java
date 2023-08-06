package ru.geekbrains.lesson6.ocp1.news;

public class SquareDraw implements Drawer{
    @Override
    public void draw() {
        System.out.println("Специфическая отрисовка квадрата.");
    }
}
