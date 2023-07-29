package homework;

public class Actor {
    private String name;
    /**
     * @param isMakeOrder -  готовность сделать заказ
     */
    private boolean isMakeOrder;

    /**
     * @param isTaleOrder -  факт получения заказа
     */
    private boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
        this.isMakeOrder = false;
        this.isTakeOrder = false;
    }

    public String getName() {
        return name;
    }

    /**
     * Получение статуса готовности сделать заказ
     */
    public boolean getIsMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Установка статуса сделать заказ
     */
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    /**
     * Статус получения заказа
     */
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Установка статуса получения заказа
     */
    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }


    public void showStatus() {
        StringBuilder sb = new StringBuilder("Покупатель " + this.name);
        if (this.isTakeOrder) sb.append(" получил заказ");
        else
            if (this.isMakeOrder) sb.append(" готов сделать заказ");
                else sb.append(" еще не готов сделать заказ");
        System.out.println(sb.toString());
        }
    }

