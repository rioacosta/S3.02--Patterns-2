package builder.specificBuilders;

import builder.pizzaAndPizzaBuilder.Pizza;
import builder.pizzaAndPizzaBuilder.PizzaBuilder;

import java.util.List;

public class PizzaMenuBuilder implements PizzaBuilder {
    private Pizza pizza;


    @Override
    public PizzaBuilder reset() {
       pizza = new Pizza();
        return this;
    }

    @Override
    public PizzaBuilder pickSize(String size) {
        pizza.setSize(size);
        return this;
    }

    @Override
    public PizzaBuilder doughType(String dough) {
        pizza.setDough(dough);
        return this;
    }

    @Override
    public PizzaBuilder addToppings(List<String> toppings) {
        pizza.setToppings(toppings);
        return this;
    }

    @Override
    public Pizza makePizza() {
        return pizza;
    }

}
