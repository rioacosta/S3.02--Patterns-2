package builder.pizzaAndPizzaBuilder;

import java.util.List;

public interface PizzaBuilder {
    PizzaBuilder reset();
    PizzaBuilder pickSize(String size);
    PizzaBuilder doughType(String dough);
    PizzaBuilder addToppings(List<String> toppings);
    Pizza makePizza();

}
