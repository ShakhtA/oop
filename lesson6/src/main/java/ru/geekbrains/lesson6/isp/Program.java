package ru.geekbrains.lesson6.isp;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        ArrayList<PaymentService> paymentServices = new ArrayList<>();
        paymentServices.add(new CustomPaymentService());
       // paymentServices.add(new InternetPaymentService());


        for (PaymentService paymentService: paymentServices) {
            if (paymentService instanceof WebMoneyPayable){
                ((WebMoneyPayable)paymentService).payWebMoney(1000);
                break;
            }

        }



    }

}
