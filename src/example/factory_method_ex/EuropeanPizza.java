package example.factory_method_ex;

public class EuropeanPizza implements Pizza {

    @Override
    public void preparing() {
        System.out.println("Приготовление европейской пиццы");
    }

    @Override
    public void backing() {
        System.out.println("Выпечка европейской пиццы");
    }

    @Override
    public void cutting() {
        System.out.println("Нарезка европейской пиццы");
    }

    @Override
    public void packaging() {
        System.out.println("Упаковка европейской пиццы");
    }
}
