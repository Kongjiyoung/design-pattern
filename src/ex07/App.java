package ex07;

import ex07.lib.DB;
import ex07.lib.MariaDB;
import ex07.lib.OracleDB;

public class App {
    public static void main(String[] args) {
        DBFactory factory = DBFactory.getInstance();
        DB oracleDB = factory.createDB("maria");
    }
}
