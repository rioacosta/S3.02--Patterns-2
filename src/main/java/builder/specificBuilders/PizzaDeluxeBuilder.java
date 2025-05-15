package builder.specificBuilders;

import builder.pizzaAndPizzaBuilder.Pizza;
import builder.pizzaAndPizzaBuilder.PizzaBuilder;

import java.util.List;

public class PizzaDeluxeBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza("Mediana", "Cereales y delicioso borde de queso", (List.of("Salsa", "Queso", "Queso Extra")));

    public PizzaDeluxeBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.pizza = new Pizza("Mediana", "Cereales y delicioso borde de queso", (List.of("Salsa", "Queso", "Queso Extra")));
    }

    @Override
    public String pickSize(String size) {
        pizza.setSize(size);
        return size;
    }

    @Override
    public String doughType(String dough) {
        this.pizza.setDough("Cereales y delicioso borde de queso");
        return dough;
    }

    @Override
    public List<String> addToppings(List<String> toppings) {
        pizza.setToppings(toppings);
        return toppings;
    }

    @Override
    public Pizza makePizza() {
        return this.pizza;
    }
}

