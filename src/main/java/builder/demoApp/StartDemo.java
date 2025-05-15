package builder.demoApp;

import builder.directorBuilder.PizzaMasterDirector;
import builder.pizzaAndPizzaBuilder.Pizza;
import builder.specificBuilders.PizzaDeluxeBuilder;
import builder.specificBuilders.PizzaMenuBuilder;

import java.util.List;

public class StartDemo {
    public static void now () {
        PizzaMenuBuilder pizzer = new PizzaMenuBuilder();
        PizzaMasterDirector mestrePizzer = new PizzaMasterDirector(pizzer);

        Pizza margherita = pizzer.makePizza();

        List<String> caprichosa = List.of("Spinaca", "Alcachofas", "Queso Feta");
        Pizza caprichitos = mestrePizzer.customizedPizza("Pequeña", "Americana", caprichosa);

        Pizza hawaiiana = mestrePizzer.makeHawaianPizza();
        hawaiiana.setToppings((List.of("Queso amarillo extra", "")));
        hawaiiana.setSize("Grande");
        hawaiiana.setDough("Americana");

        Pizza romana = mestrePizzer.makeRomanPizza();
        Pizza vegguie = mestrePizzer.makeVeggiePizza();

        System.out.println(margherita +"Ejemplo de pizza construida directamente por el builder especifico\n\n"+
                caprichitos+" ejemplo de pizza personalizada\n"+
                romana +" ejemplo de pizza standard\n"+
                vegguie +" ejemplo de pizza standard\n"+
                hawaiiana +" ejemplo de pizza standard modificada\n");


        PizzaDeluxeBuilder pizzerDeluxe = new PizzaDeluxeBuilder();
        PizzaMasterDirector mestrePizzer2 = new PizzaMasterDirector(pizzerDeluxe);

        List<String> caprichosa2 = List.of("Escamorzza", "Berenjena confitada", "Trufa");
        Pizza caprichitos2 = mestrePizzer2.customizedPizza("Pequeña", "", caprichosa2);

        Pizza hawaiiana2 = mestrePizzer2.makeHawaianPizza();
        Pizza romana2 = mestrePizzer2.makeRomanPizza();
        romana2.setSize("Grande");

        System.out.println("\n"+ caprichitos2+" pizza deluxe personalizada\n"+
                hawaiiana2+" ejemplo de deluxe pizza standard\n"+
                romana2 +" ejemplo de deluxe pizza standard modificada\n");
    }
}
