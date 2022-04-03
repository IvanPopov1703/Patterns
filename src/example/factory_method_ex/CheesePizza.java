package example.factory_method_ex;

public class CheesePizza implements Pizza {

    @Override
    public void preparing() {
        System.out.println("Приготовление сырной пиццы");
    }

    @Override
    public void backing() {
        System.out.println("Выпечка сырной пиццы");
    }

    @Override
    public void cutting() {
        System.out.println("Нарезка сырной пиццы");
    }

    @Override
    public void packaging() {
        System.out.println("Упаковка сырной пиццы");
    }
}
