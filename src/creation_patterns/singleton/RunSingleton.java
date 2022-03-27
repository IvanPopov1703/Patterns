package creation_patterns.singleton;

public class RunSingleton {

    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
        chocolateBoiler1.fill();
        chocolateBoiler2.fill();
        chocolateBoiler1.boil();
        chocolateBoiler1.drain();
        chocolateBoiler2.drain();
    }
}
