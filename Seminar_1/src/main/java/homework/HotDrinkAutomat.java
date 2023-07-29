package homework;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkAutomat implements TradeAutomat {
    private int id;
    static int counter = 0;
    private List<HotDrink> listHotDrink = new ArrayList<>();

    public HotDrinkAutomat() {
        id = ++counter;
    }

    public List getListProduct() {
        return listHotDrink;
    }

    public void setListProduct(HotDrink hotDrink) {
        listHotDrink.add(hotDrink);
    }

    public void getProduct(String name) {
        for (int i = 0; i < listHotDrink.size(); i++) {
            if (listHotDrink.get(i).getName().equals(name)) {
                System.out.printf("%s, %d гр, %d°С, %d р.\n",
                        listHotDrink.get(i).getName(),
                        listHotDrink.get(i).getVolume(),
                        listHotDrink.get(i).getTemperature(),
                        listHotDrink.get(i).getPrice());
            } else {
                System.out.println("Такого напитка нет в ассортименте");
            }
        }
    }

    public void getProduct(String name, int volume, int temperature) {
        boolean isContains = false;
        for (int i = 0; i < listHotDrink.size(); i++) {
            if (listHotDrink.get(i).getName().equals(name) &&
                    listHotDrink.get(i).getVolume() == volume &&
                    listHotDrink.get(i).getTemperature() == temperature) {
                isContains = true;
                System.out.printf("%s, %d гр, %d°С, %d р.\n",
                        listHotDrink.get(i).getName(),
                        listHotDrink.get(i).getVolume(),
                        listHotDrink.get(i).getTemperature(),
                        listHotDrink.get(i).getPrice());
            }
        }
            if (!isContains) System.out.println("Такого напитка нет в ассортименте");
    }

    public void displayId() {
        System.out.printf("id: %d\n", id);
    }
}
