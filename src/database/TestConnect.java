package database;

import java.sql.Connection;

public class TestConnect {
    public static void main(String[] args) {
        Connection connect = Conect.getConnection();
        Conect.closeConnection(connect);
    }
}
