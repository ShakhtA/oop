package ru.geekbrains.lesson6.lsp;

import java.util.ArrayList;

public class Program {

    // Тип S будет подтипом Т тогда и только тогда,
    // когда каждому объекту oS типа S соответствует некий объект oT типа T таким образом,
    // что для всех программ P,
    // реализованных в терминах T, поведение P не будет меняться, если oT заменить на oS.

    public static void main(String[] args) {

        Bird oT1 = new Bird(40, true);
        Bird oT2 = new Bird(40, true);
        Bird oT3 = new Bird(40, true);
        Bird oT4 = new Bird(40, true);

        Duck oS1 = new Duck(60);
        Duck oS2 = new Duck(60);
        Duck oS3 = new Duck(60);

        Penguin oS4 = new Penguin();

        ArrayList arrayList = new ArrayList();
        arrayList.add(oT1);
        arrayList.add(oT2);
        arrayList.add(oT3);
        arrayList.add(oT4);
        arrayList.add(oS1);
        arrayList.add(oS2);
        arrayList.add(oS3);
        arrayList.add(oS4);


        processBirdsFly(arrayList);

    }

    /**
     * P
     * @param birds
     */
    public static void processBirdsFly(ArrayList<Bird> birds){
        for (Bird bird: birds) {
            if (bird.isCanFly())
                bird.fly();
        }
    }

}

class Penguin extends Bird{


    public Penguin() {
        super(0, false);
    }

    @Override
    public void fly() {
        throw  new RuntimeException("Пингвин не умеет летать!");
        //System.out.println("Пингвин не умеет летать!");
    }


}


/**
 * S
 */
class Duck extends Bird{

    public Duck(int flySpeed) {
        super(flySpeed, true);
    }

    @Override
    public void fly() {
        System.out.printf("Утка летит со скоростью %d км/ч \n", flySpeed);
    }
}


/**
 * T
 */
class Bird{

    protected int flySpeed = 10;
    private boolean canFly;


    public boolean isCanFly() {
        return canFly;
    }

    public int getFlySpeed() {
        return flySpeed;
    }

    public Bird(int flySpeed, boolean canFly) {
        this.flySpeed = flySpeed;
        this.canFly = canFly;
    }

    public void fly(){
        System.out.printf("Птица летит со скоростью %d км/ч \n", flySpeed);
    }

}
