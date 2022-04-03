package creation_patterns.singleton;

public class Logger {

    private static Logger instance;
    private String strLog;

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                instance = new Logger();
            }
        }
        return instance;
    }

    public void printLog() {
        System.out.println(strLog);
    }

    public void addLog(String log) {
        strLog += log + "\n";
    }

    private Logger() {
        strLog = "Log: \n\n";
    }
}
