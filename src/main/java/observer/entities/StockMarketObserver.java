package observer.entities;

import observer.interfaces.StockListener;
import observer.interfaces.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class StockMarketObserver implements StockObserver {
    public static List<StockListener> listeners = new ArrayList<>();

    @Override
    public void subscribe(StockListener agency) {
        System.out.println("Este agencia ahora es un cliente");
        listeners.add(agency);
    }
    @Override
    public void unsubscribe(StockListener agency) {
        System.out.println("Este agency ya no contrata nuestros servicios");
        listeners.remove(agency);
    }
    @Override
    public void notifyListeners(String event) {
        List<StockListener> users = listeners;
        for (StockListener agency : users) {
            agency.update(event);
        }
    }

    public void stockEvent(String change){
        System.out.println("Nueva actualización en bolsa :" + change);
        notifyListeners(change);
    }
}
