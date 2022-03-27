package structural_patterns.adapter;

public class AdapterMySql implements Oracle {

    private MySql mySql;

    public AdapterMySql(MySql mySql) {
        this.mySql = mySql;
    }

    @Override
    public void connect() {
        mySql.connectDB();
    }

    @Override
    public void disconnect() {
        mySql.disconnectDB();
    }

    @Override
    public boolean isConnect() {
        return mySql.isConnect();
    }
}
