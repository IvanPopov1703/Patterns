package structural_patterns.adapter;

public interface Oracle {

    void connect();
    void disconnect();
    boolean isConnect();
}
