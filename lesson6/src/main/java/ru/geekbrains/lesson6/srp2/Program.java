package ru.geekbrains.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        InputData inputData = new InputData(order);
        inputData.inputFromConsole();
        SaveData saveData = new SaveData(order);
        saveData.saveToJson();

    }
}
