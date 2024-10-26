import java.sql.SQLException;

/**
 * Created by Козадаев_АС on 28.11.2017.
 */
public class Main {

    public static void main(String[] args) {
        try {
            Conn.Conn("History.db");
            Conn.ReadDB();
            Conn.CloseDB();
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " +e.toString());
            //            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

}
}