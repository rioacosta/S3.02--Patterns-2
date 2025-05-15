package observer.entities;

import observer.interfaces.StockListener;

public class StockAgency implements StockListener {
    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Mensaje recibido en la agencia: " + this.name +": "+ event);
    }
}