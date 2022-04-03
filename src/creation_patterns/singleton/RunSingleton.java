package creation_patterns.singleton;

public class RunSingleton {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.addLog("Слово1");
        logger1.addLog("Слово2");
        Logger logger2 = Logger.getInstance();
        logger2.printLog();
        logger2.addLog("Слово3");
        logger2.printLog();
        logger1.printLog();
    }
}
