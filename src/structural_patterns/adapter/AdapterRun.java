package structural_patterns.adapter;

public class AdapterRun {

    public static void main(String[] args) {
        Oracle oracle = new OracleDB("oracle");
        MySql mySql = new MySqlDB("mySql");

        System.out.println("\nРабота с mySql");
        mySql.connectDB();
        mySql.isConnect();
        mySql.disconnectDB();

        System.out.println();

        System.out.println("Работа с oracle");
        testAdapter(oracle);

        System.out.println("\nРабота с адаптером");
        Oracle mySqlAdapter = new AdapterMySql(mySql);
        testAdapter(mySqlAdapter);
    }

    private static void testAdapter(Oracle oracle) {
        oracle.connect();
        oracle.isConnect();
        oracle.disconnect();
    }
}
