package homework;

import java.util.List;

public interface MarketBehaviour {
    /**
     * Приход покупателя в магазин
     */
    void acceptToMarket(Actor actor);

    /**
     * Уход покупателя из магазина
     */
    void releaseFromMarket(Actor actor);

    /**
     * Обновление состояния магазина
     */
    void update();
}
