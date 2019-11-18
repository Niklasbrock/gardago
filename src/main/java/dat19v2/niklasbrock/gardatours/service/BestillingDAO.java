package dat19v2.niklasbrock.gardatours.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BestillingDAO {

    // NOTE: doesnt work yet.......
    public void insert() {
        String sql = "SELECT * FROM Bestilling" + " (Antal, Kunde_idKunde, " +
                "Ruter_idRuter ) VALUES ( ?,?,? )";

        try (
                Connection connection =
                        DatabaseAdapter.getInstance().getConnection();
                PreparedStatement ps = connection.prepareStatement( sql );
                ) {

        } catch ( SQLException ex ) {
            DatabaseAdapter.getInstance().processException( ex );
            throw new RuntimeException( ex );
        }
    }
    public void delete(){}
    public String select(){
        return null;
    };
}
