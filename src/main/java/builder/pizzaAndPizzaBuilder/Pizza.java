package builder.pizzaAndPizzaBuilder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
        String size;
        String dough;
        List<String> toppings = new ArrayList<>();

        public Pizza () {        }

        public void setSize(String size) {
                this.size = size;
        }

        public void setDough(String dough) {
                this.dough = dough;
        }

        public void setToppings(List<String> newtoppings) {
                this.toppings = new ArrayList<>(newtoppings);
        }

        @Override
        public String toString() {
                return "Pizza --> " + "Tamaño = " + this.size + ", Masa = " + this.dough + ", Ingredientes = " + this.toppings + "----";
        }
}
