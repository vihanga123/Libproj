import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
public class books {
    public static void bookdb(){
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

    String[] books = {"The Lord of the Rings", "Harry Potter", "The Hobbit", "Jane Eyre"};
        public void printBooks(){
            System.out.println(Arrays.toString(books));


        }
}



