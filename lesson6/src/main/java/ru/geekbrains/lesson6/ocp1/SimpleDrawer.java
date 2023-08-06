package ru.geekbrains.lesson6.ocp1;

public class SimpleDrawer {

    public void draw(Shape shape){

        switch (shape.getShapeType()){
            case Circle -> drawCircle(shape);
            case Square -> drawSquare(shape);
            case Triangle -> drawTriangle(shape);
        }

    }

    private void drawCircle(Shape shape){
        System.out.println("Отрисовка окружности ...");
    }

    private void drawSquare(Shape shape){
        System.out.println("Отрисовка квадрата ...");
    }

    private void drawTriangle(Shape shape){
        System.out.println("Отрисовка  ...");
    }


}
