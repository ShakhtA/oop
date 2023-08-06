package ru.geekbrains.lesson6.ocp1.news;

public abstract class Shape {

    private Drawer drawer;
    public  void draw(){
        if (drawer == null)
            System.out.println("Отрисовка фигуры (default)");
        else
            drawer.draw();
    }

    public final void setDrawer(Drawer drawer){
        this.drawer = drawer;
    }

}
