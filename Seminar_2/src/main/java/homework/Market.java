package homework;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    private List<Actor> actorsList;

    public Market() {
        actorsList = new ArrayList<>();
    }

    List<Actor> getActorsList() {
        return actorsList;
    }

    public void acceptToMarket(Actor actor) {
        System.out.printf("%s пришел в магазин\n", actor.getName());
        update();
    };

    public void releaseFromMarket(Actor actor) {
        System.out.printf("%s ушел из магазина\n", actor.getName());
        System.out.println("================");
    }

    public void update() {
        if (actorsList.size() != 0) {
            System.out.print("В очереди находятся: ");
            for (Actor actor : actorsList) {
                System.out.printf(actor.getName() + " ");
            }
            System.out.println();
        } else System.out.println("Очередь пуста");
    }

    public void takeInQueue (Actor actor) {
        actorsList.add(actor);
        System.out.printf("%s помещен в очередь\n", actor.getName());
        update();
    }

    public void takeOrders() {
        System.out.println("Заказ принят");
    }

    public void giveOrders(){
        System.out.println("Заказ выдан");
    }

    public void releaseFromQueue() {
        System.out.println("Покупатель освобожден из очереди");
        actorsList.remove(0);
        update();
    }
}
