package dat19v2.niklasbrock.gardatours.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseAdapter {

    private static DatabaseAdapter instance;

    private Connection con;
    String username = "root";
    String password = "rootkode";
    String path = "jdbc:mysql://localhost:3306/Gardago?useUnicode=true" +
            "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


    private DatabaseAdapter(){
        try {
            System.out.println(username+" has connected to the database.\n");
            this.con = DriverManager.getConnection(path, username, password);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static DatabaseAdapter getInstance(){
        if ( instance == null ) {
            instance = new DatabaseAdapter();
        }
        return instance;
    }

    public Connection getConnection() {
        return con;
    }

    public void processException(SQLException ex ) {
        System.err.println( "Error message: " + ex.getMessage() );
        System.err.println( "Error code: " + ex.getErrorCode() );
        System.err.println( "SQL state: " + ex.getSQLState() );
    }
}