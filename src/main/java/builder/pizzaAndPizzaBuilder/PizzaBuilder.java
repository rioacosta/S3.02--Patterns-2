package builder.pizzaAndPizzaBuilder;

import java.util.List;

public interface PizzaBuilder {
    void reset();
    String pickSize(String size);
    String doughType(String dough);
    List<String> addToppings(List<String> toppings);
    Pizza makePizza();

}
