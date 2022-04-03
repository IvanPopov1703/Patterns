package example.singleton_ex;

public class ChocolateBoiler {

    private static ChocolateBoiler instance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler () {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println("Наполненение нагревателя молочно-шоколадной смесью");
            empty = false;
            boiled = false;
        } else {
            System.out.println("Нагреватель уже наполнен смесью");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("Сливаем нагретое молоко и шоколад");
            empty = true;
        } else {
            if (isEmpty()) {
                System.out.println("Наполните нагреватель смесью");
            } else {
                if (!isBoiled()) {
                    System.out.println("Доведите смесь до кипения");
                }
            }
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("Доводим содержимое до кипения");
            boiled = true;
        } else {
            if (isEmpty()) {
                System.out.println("Наполните нагреватель смесью");
            } else {
                if (isBoiled()) {
                    System.out.println("Смесь уже доведена до кипения");
                }
            }
        }
    }

    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }
}
