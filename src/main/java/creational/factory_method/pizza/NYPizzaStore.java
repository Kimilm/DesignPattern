package creational.factory_method.pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if ("Cheese".equals(type))
            return new NYStyleCheesePizza();
        else if ("Pepperoni".equals(type))
            return new NYStylePepperoniPizza();
        else
            throw new IllegalArgumentException();
    }
}

class NYStyleCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("뉴욕스타일 치즈피자 준비중");
    }

    @Override
    public void bake() {
        System.out.println("뉴욕스타일 치즈피자 굽는중");
    }

    @Override
    public void box() {
        System.out.println("뉴욕스타일 치즈피자 포장중");
    }
}

class NYStylePepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("뉴욕스타일 페페로니피자 준비중");
    }

    @Override
    public void bake() {
        System.out.println("뉴욕스타일 페페로니피자 굽는중");
    }

    @Override
    public void box() {
        System.out.println("뉴욕스타일 페페로니피자 포장중");
    }
}