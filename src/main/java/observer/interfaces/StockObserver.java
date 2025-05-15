package observer.interfaces;

public interface StockObserver {
    void subscribe(StockListener listener);
    void unsubscribe(StockListener listener);
    void notifyListeners(String event);
}
