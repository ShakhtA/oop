package ru.geekbrains.lesson6.isp;

public interface Payment {

    void payWebMoney(int amount);
    void payCreditCard(int amount);

    void payPhoneNumber(int amount);

}
