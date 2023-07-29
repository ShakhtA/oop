package homework;

public interface QueueBehaviour {
    /**
     * Помещение покупателя в очередь
     * @param actor - покупатель
     */
    void takeInQueue (Actor actor);

    /**
     * Принятие заказа
     */
    void takeOrders();

    /**
     * Отдача заказа
     */
    void giveOrders();

    /**
     * Освобождение из очереди
     */
    void releaseFromQueue();
}
