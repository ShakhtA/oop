package ru.geekbrains.lesson6.srp1;

public class SquareDrawer {

    private  Square square;

    private int scale = 1;

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public Square getSquare() {
        return square;
    }

    public SquareDrawer(Square square) {
        this(square, 1);
    }

    public SquareDrawer(Square square, int scale) {
        this.square = square;
        this.scale = scale;
    }

    public void draw(){
        for (int i = 0; i < square.getSide() * 2 * scale; i++)
            System.out.print("* ");
        System.out.println();

        for (int i = 0; i < square.getSide() * 2 * scale - 2; i++){
            System.out.print("*");

            for (int j = 1; j < square.getSide() * 2 * scale - 1; j++){
                System.out.print("  ");
            }
            System.out.println(" *");
        }

        for (int i = 0; i < square.getSide() * scale * 2; i++)
            System.out.print("* ");
        System.out.println();
    }



}
