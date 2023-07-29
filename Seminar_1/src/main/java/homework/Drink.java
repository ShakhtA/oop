package homework;

public class Drink {
    private String name;
    private int volume;
    private int price;

    public Drink() {
        this("Undefined", 200, 0);
    }

    public Drink(String name, int price) {
        this(name, 200, price);
    }

    public Drink(String name, int volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.printf("Напиток: %s, объем: %d гр, цена: %d р.\n", getName(), getVolume(), getPrice());
    }
}
