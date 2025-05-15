package builder.specificBuilders;

import builder.pizzaAndPizzaBuilder.Pizza;
import builder.pizzaAndPizzaBuilder.PizzaBuilder;

import java.util.List;

public class PizzaMenuBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza("Mediana", "Clasica", (List.of("Salsa", "Queso")));

    public PizzaMenuBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.pizza = new Pizza("Mediana", "Clasica", (List.of("Salsa", "Queso")));
    }

    @Override
    public String pickSize(String size) {
        pizza.setSize(size);
        return size;
    }

    @Override
    public String doughType(String dough) {
        pizza.setDough(dough);
        return dough;
    }

    @Override
    public List<String> addToppings(List<String> toppings) {
        pizza.setToppings(toppings);
        return toppings;
    }

    @Override
    public Pizza makePizza() {
        return pizza;
    }

}
