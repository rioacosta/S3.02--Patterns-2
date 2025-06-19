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
        return  pizzaBuilder.reset()
                .pickSize("Mediana")
                .doughType("Clasica")
                .addToppings(List.of("piña", "queso", "jamón"))
                .makePizza();
    }

    public Pizza makeRomanPizza () {
        return  pizzaBuilder.reset()
                .pickSize("Mediana")
                .doughType("Clasica")
                .addToppings(List.of("Aceitunas negras", "Champiñones", "Jamón"))
                .makePizza();
    }

    public Pizza makeVeggiePizza () {
        return    pizzaBuilder.reset()
                    .pickSize("Mediana")
                    .doughType("Clasica")
                    .addToppings(List.of("Maiz", "Aceitunas", "Calabacin", "Berenjena", "Pimiento", "Cebolla"))
                    .makePizza();
    }

    public Pizza customizedPizza (String size, String dough, List<String> toppings) {
        return pizzaBuilder.reset()
                    .pickSize(size)
                    .doughType(dough)
                    .addToppings(toppings)
                    .makePizza();
    }
}
