package dat19v2.niklasbrock.gardatours.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RuterDAO implements IDAO {

    // NOTE: DOESNT MATTER....
    public void insert() {
        String sql = "INSERT INTO Ruter" + " (Pris, Ruter, Beskrivelse) " +
                "VALUES (?, ?, ?)";
        Connection connection = null;

        try {
            connection = DatabaseAdapter.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement( sql );
            ps.setInt( 1, 666 );
            ps.setString( 2, "Garda til helvede xD" );
            ps.executeUpdate();
            ps.close();
        } catch( Exception ex ) {
            System.err.println( "ERROR: " + ex );
        } finally {
            if ( connection != null ) {
                try {
                    connection.close();
                } catch ( SQLException ex ) {
                    System.err.println( "ERROR " + ex );
                 }
            }
        }

    };
    public void delete(){};
    public String select(){
        return null;
    };


}
