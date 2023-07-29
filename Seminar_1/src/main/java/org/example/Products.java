package org.example;

public class Products {
    private String name;
    private double price;

    public Products() {
        this("Undefined", 0.0);
    }

    public Products(String name) {
        this(name, 0.0);
    }

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
