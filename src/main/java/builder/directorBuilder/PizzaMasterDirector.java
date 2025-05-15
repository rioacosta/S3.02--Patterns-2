package builder.directorBuilder;

import builder.pizzaAndPizzaBuilder.Pizza;
import builder.pizzaAndPizzaBuilder.PizzaBuilder;

import java.util.List;

public class PizzaMasterDirector {

    private PizzaBuilder pizzaBuilder;

    public PizzaMasterDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    public Pizza makeHawaianPizza() {
        pizzaBuilder.reset();
        pizzaBuilder.pickSize("Mediana");
        pizzaBuilder.doughType("Clasica");
        pizzaBuilder.addToppings(List.of("piña", "queso", "jamón"));
        return pizzaBuilder.makePizza();
    }

    public Pizza makeRomanPizza () {
        pizzaBuilder.reset();
        pizzaBuilder.pickSize("Mediana");
        pizzaBuilder.doughType("Clasica");
        pizzaBuilder.addToppings(List.of("Aceitunas negras", "Champiñones", "Jamón"));
        return pizzaBuilder.makePizza();
    }

    public Pizza makeVeggiePizza () {
        pizzaBuilder.reset();
        pizzaBuilder.pickSize("Mediana");
        pizzaBuilder.doughType("Clasica");
        pizzaBuilder.addToppings(List.of("Maiz", "Aceitunas", "Calabacin", "Berenjena", "Pimiento", "Cebolla"));
        return pizzaBuilder.makePizza();
    }

    public Pizza customizedPizza (String size, String dough, List<String> toppings) {
        pizzaBuilder.reset();
        pizzaBuilder.pickSize(size);
        pizzaBuilder.doughType(dough);
        pizzaBuilder.addToppings(toppings);
        return pizzaBuilder.makePizza();
    }
}
