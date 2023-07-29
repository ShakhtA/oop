package homework;

public class Main {
    public static void main(String[] args) {

        Actor[] actorsArray = new Actor[6];
        actorsArray[0] = new Actor("Sam");
        actorsArray[1] = new Actor("Bob");
        actorsArray[2] = new Actor("Kate");
        actorsArray[3] = new Actor("Joe");
        actorsArray[4] = new Actor("Alice");
        actorsArray[5] = new Actor("Bill");
        Market market = new Market();
        for (int i = 0; i < 2; i++) {
            market.acceptToMarket(actorsArray[i]);
            market.takeInQueue (actorsArray[i]);
            System.out.println("=====================");
        }

        while (!market.getActorsList().isEmpty()) {
            Actor firstActor = market.getActorsList().get(0);
            firstActor.setMakeOrder(true);
            if (firstActor.getIsMakeOrder()) {
                System.out.println("Обслуживается покупатель " + firstActor.getName());
                market.takeOrders();
                market.giveOrders();
                firstActor.setTakeOrder(true);
            }

            if (firstActor.getIsMakeOrder()) {
                market.releaseFromQueue();
                market.releaseFromMarket(firstActor);
            }
        }
   }
}