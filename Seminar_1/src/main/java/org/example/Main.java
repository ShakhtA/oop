package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Products> listProd = new ArrayList<Products>();
//        listProd.add(new Products("Молоко", 70.0));
//        listProd.add(new Products("Хлеб", 39.5));
//        listProd.add(new Products("Мука", 68.0));
//        listProd.add(new Products("Картошка", 45.2));
//        listProd.add(new Products("Рис", 90.0));
//        listProd.add(new Products("Кофе", 235.5));

        TradeAutomat tradeAutomat1 = new TradeAutomat();
        tradeAutomat1.setListProducts(new Products("Молоко", 70.0));
        tradeAutomat1.setListProducts(new Products("Хлеб", 39.5));
        tradeAutomat1.setListProducts(new Products("Мука", 68.0));
        tradeAutomat1.setListProducts(new Products("Картошка", 45.2));
        tradeAutomat1.setListProducts(new Products("Рис", 90.0));
        tradeAutomat1.setListProducts(new Products("Кофе", 235.5));
        ArrayList<Products> tmp = new ArrayList<>(tradeAutomat1.getListProducts());
        for(Products item:tmp)
            System.out.printf("%s: %.1f p.\n", item.getName(), item.getPrice());

        tradeAutomat1.getProducts("Хлеб");

    }


}