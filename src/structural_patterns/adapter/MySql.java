package structural_patterns.adapter;

public interface MySql {

    void connectDB();
    void disconnectDB();
    boolean isConnect();
}
