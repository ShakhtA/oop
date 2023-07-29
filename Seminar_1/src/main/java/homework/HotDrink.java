package homework;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink() {
        super();
        temperature = 0;
    }

    public HotDrink(String name, int volume, int temperature, int price) {
        super(name, volume, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Напиток: %s, объем: %d гр, температура: %d°С, цена: %d р.\n",
                            getName(), getVolume(), getTemperature(), getPrice());
    }
}
