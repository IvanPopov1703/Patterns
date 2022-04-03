package example.factory_method_ex;

public class PepperoniPizza implements Pizza {

    @Override
    public void preparing() {
        System.out.println("Приготовление пиццы пеперони");
    }

    @Override
    public void backing() {
        System.out.println("Выпечка пиццы пеперони");
    }

    @Override
    public void cutting() {
        System.out.println("Нарезка пиццы пеперони");
    }

    @Override
    public void packaging() {
        System.out.println("Упаковка пиццы пеперони");
    }
}
