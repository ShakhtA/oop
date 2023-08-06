package ru.geekbrains.lesson6.srp1;

public class Program {

    public static void main(String[] args) {
        Square square = new Square(new Point(1, 1), 5);
        SquareDrawer squareDrawer = new SquareDrawer(square, 3);
        squareDrawer.draw();
    }

}
