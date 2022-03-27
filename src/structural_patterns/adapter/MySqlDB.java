package structural_patterns.adapter;

public class MySqlDB implements MySql {

    private boolean connect;
    private String nameDB;

    public MySqlDB(String nameDB) {
        this.nameDB = nameDB;
    }

    @Override
    public void connectDB() {
        if (!isConnect()) {
            System.out.println("Подключение к БД: " + nameDB);
            connect = true;
        } else {
            System.out.println("Подключение уже установлено");
        }
    }

    @Override
    public void disconnectDB() {
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
