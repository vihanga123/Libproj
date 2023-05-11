import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    public static void LibraryDB(){

        String url = "jdbc:sqlite:C://sqlite/java/connect/library.db";

        String sql = "CREATE TABLE IF NOT EXISTS books (\n"
                + " id integer PRIMARY KEY,\n"
                + " title text NOT NULL,\n"
                + " author text NOT NULL,\n"
                + " genre text NOT NULL,\n"
                + " pages integer NOT NULL\n"
                + ");";


        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement())
        {

            //table creation
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e1) {
            throw new RuntimeException(e1);
        }
    }
    public static void bookDB(){
        Connection conn = null;
        try{
            String url = "jdbc:sqlite:C:/sqlite/java/connect/books.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e1) {
            throw new RuntimeException(e1);
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
