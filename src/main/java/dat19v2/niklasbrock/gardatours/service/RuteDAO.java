package dat19v2.niklasbrock.gardatours.service;

import dat19v2.niklasbrock.gardatours.model.Rute;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RuteDAO implements IRuteDAO {

    // NOTE: DOESNT MATTER....
    public void insert() {
        String sql = "INSERT INTO Rute" + " (Pris, Rute, Beskrivelse) " +
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

    }

    public void delete(){};

    public List<Rute> select() {
        List<Rute> ruter = new ArrayList<>();
        String sql = "SELECT * FROM rute";
        Connection connection = null;

        try {
            connection = DatabaseAdapter.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement( sql );
            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {
                Rute rute = new Rute();
                rute.setPris( rs.getInt( "Pris" ) );
                rute.setNavn( rs.getString( "Navn" ) );
                rute.setBeskrivelse( rs.getString( "Beskrivelse" ) );
                ruter.add( rute );
            }

            ps.close();
            rs.close();
            return ruter;
        } catch ( SQLException ex ) {
            System.err.println( "ERROR: " + ex );
            throw new RuntimeException( ex );
        } finally {
            if ( connection != null ) {
                try {
                    connection.close();
                } catch ( SQLException ex ) {
                    System.err.println( "ERROR" + ex );
                }
            }
        }

    }
}
