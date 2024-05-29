package pratice.ex07;


import pratice.ex07.lib.DB;
import pratice.ex07.lib.Driver;

public class App {
    public static void main(String[] args) {
        DBFactory factory = DBFactory.getInstance();
        DB oracleDB = factory.createDB(Driver.ORACLE);
        oracleDB.execute("select");
    }
}
