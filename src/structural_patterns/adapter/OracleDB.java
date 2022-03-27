package structural_patterns.adapter;

public class OracleDB implements Oracle{

    private boolean connect;
    private String nameDB;

    public OracleDB(String nameDB) {
        this.nameDB = nameDB;
    }

    @Override
    public void connect() {
        if (!isConnect()) {
            System.out.println("Подключение к БД: " + nameDB);
            connect = true;
        } else {
            System.out.println("Подключение уже установлено");
        }
    }

    @Override
    public void disconnect() {
        if (isConnect()) {
            System.out.println("Отключение от БД: " + nameDB);
            connect = false;
        } else {
            System.out.println("Не подключен к БД");
        }
    }

    @Override
    public boolean isConnect() {
        return connect;
    }
}
