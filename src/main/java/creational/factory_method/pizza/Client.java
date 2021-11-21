package creational.factory_method.pizza;

public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("Cheese");
    }
}
