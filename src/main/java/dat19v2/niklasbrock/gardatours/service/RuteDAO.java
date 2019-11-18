package dat19v2.niklasbrock.gardatours.service;

import dat19v2.niklasbrock.gardatours.model.Rute;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RuteDAO {

    public void delete(){};

    public List<Rute> select() {
        List<Rute> ruter = new ArrayList<>();
        String sql = "SELECT * FROM rute";

        try (
                Connection connection =
                        DatabaseAdapter.getInstance().getConnection();
                PreparedStatement ps = connection.prepareStatement( sql );
                ResultSet rs = ps.executeQuery();
                ) {
            while ( rs.next() ) {
                Rute rute = new Rute();
                rute.setPris( rs.getInt( "Pris" ) );
                rute.setNavn( rs.getString( "Navn" ) );
                rute.setBeskrivelse( rs.getString( "Beskrivelse" ) );
                ruter.add( rute );
            }

            return ruter;
        } catch ( SQLException ex ) {
            System.err.println( "ERROR: " + ex );
            throw new RuntimeException( ex );
        }
    }
}
