package ru.geekbrains.lesson6.ocp1.news;


public class Program {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        SimpleDrawer simpleDrawer = new SimpleDrawer();
        simpleDrawer.draw(circle1);


        Square square = new Square();
        square.setDrawer(new SquareDraw());
        simpleDrawer.draw(square);
    }


}
