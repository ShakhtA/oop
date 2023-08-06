package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class InputData {

    private Scanner scanner = new Scanner(System.in);

    private Order order;
    public InputData(Order order) {
        this.order = order;
    }

    public void inputFromConsole(){
        order.setClientName(processInput("Имя клиента: "));
        order.setProduct(processInput("Продукт: "));
        order.setQnt(Integer.parseInt(processInput("Кол-во: ")));
        order.setPrice(Double.parseDouble(processInput("Цена: ")));
    }

    private String processInput(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
}
