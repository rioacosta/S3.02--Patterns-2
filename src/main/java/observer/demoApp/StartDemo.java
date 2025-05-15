package observer.demoApp;

import observer.entities.StockAgency;
import observer.entities.StockMarketObserver;

public class StartDemo {
 public static void now () {
     StockMarketObserver stockObserver = new StockMarketObserver();

     StockAgency agency1 = new StockAgency("Ruth Exchanges");
     StockAgency agency2 = new StockAgency("W&R");
     StockAgency agency3 = new StockAgency("Banco Central");
     stockObserver.subscribe(agency3);
     stockObserver.subscribe(agency2);
     stockObserver.subscribe(agency1);

     stockObserver.stockEvent("Bajada de un mercado determinado");

     stockObserver.unsubscribe(agency3);

     stockObserver.stockEvent("Subida de un mercado determinado");
 }


}
