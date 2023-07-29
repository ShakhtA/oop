package homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinkAutomat hotDrinkAutomat1 = new HotDrinkAutomat();
        hotDrinkAutomat1.setListProduct(new HotDrink("Латте", 250, 60, 45));
        hotDrinkAutomat1.setListProduct(new HotDrink("Эспрессо", 100, 60, 60));
        hotDrinkAutomat1.setListProduct(new HotDrink("Американо", 400, 60, 90));
        List<HotDrink> listCaffee = hotDrinkAutomat1.getListProduct();
        for(HotDrink item:listCaffee)
            item.displayInfo();

        System.out.println("===========");

        HotDrinkAutomat hotDrinkAutomat2 = new HotDrinkAutomat();
        hotDrinkAutomat2.setListProduct(new HotDrink("Черный чай", 250, 60, 30));
        hotDrinkAutomat2.setListProduct(new HotDrink("Зеленый чай", 300, 80, 35));
        hotDrinkAutomat2.setListProduct(new HotDrink("Чай с лимоном", 300, 60, 50));
        List<HotDrink> ListTee = hotDrinkAutomat2.getListProduct();
        for(HotDrink item:ListTee)
            item.displayInfo();
        System.out.println("===========");

        HotDrinkAutomat hotDrinkAutomat3 = new HotDrinkAutomat();
        hotDrinkAutomat3.setListProduct(new HotDrink("Горячий шоколад", 200, 50, 30));
        hotDrinkAutomat3.setListProduct(new HotDrink("Горячий шоколад", 300, 50, 40));
        hotDrinkAutomat3.setListProduct(new HotDrink("Горячий шоколад", 400, 50, 50));
        List<HotDrink> ListCocolate = hotDrinkAutomat3.getListProduct();
        for(HotDrink item:ListCocolate)
            item.displayInfo();
        System.out.println("===========");

        hotDrinkAutomat3.getProduct("Горячий шоколад");
        System.out.println("===========");

        hotDrinkAutomat3.getProduct("Горячий шоколад", 400, 60);
    }
}
