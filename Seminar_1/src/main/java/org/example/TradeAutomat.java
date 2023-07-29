package org.example;

import java.util.*;

public class TradeAutomat {
    private int id;
    static int counter = 0;

    private List<Products> listProducts = new ArrayList<>();

    public TradeAutomat() {
        id = ++counter;
    }

    public List<Products> getListProducts() {
        return listProducts;
    }

    public void setListProducts(Products product) {
        listProducts.add(product);
    }



    public void getProducts(String name) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getName().equals(name))
                System.out.printf("%s: %.1f р.\n",
                        listProducts.get(i).getName(),
                        listProducts.get(i).getPrice());
        }
    }

    public void displayId() {
        System.out.printf("id: %d\n", id);
    }

    public void showListProducts() {
        for(Products item:listProducts)
            System.out.printf("%s: %.1f p.\n", item.getName(), item.getPrice());
    }


}



