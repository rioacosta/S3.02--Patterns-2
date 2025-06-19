package builder.specificBuilders;

import builder.pizzaAndPizzaBuilder.Pizza;
import builder.pizzaAndPizzaBuilder.PizzaBuilder;

import java.util.List;

public class PizzaDeluxeBuilder implements PizzaBuilder {

    private Pizza pizza;

    @Override
    public PizzaBuilder reset() {
        this.pizza = new Pizza();
        return this;
    }

    @Override
    public PizzaBuilder pickSize(String size) {
        pizza.setSize(size);
        return this;
    }

    @Override
    public PizzaBuilder doughType(String dough) {
        this.pizza.setDough("Cereales y delicioso borde de queso");
        return this;
    }

    @Override
    public PizzaBuilder addToppings(List<String> toppings) {
        pizza.setToppings(toppings);
        return this;
    }

    @Override
    public Pizza makePizza() {
        return this.pizza;
    }
}

