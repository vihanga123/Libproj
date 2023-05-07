import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

public class Library {

    //Creates the database using sqlite
    public static void dbconnect(){
        Connection conn = null;
        try{
            String url = "jdbc:sqlite:C:/sqlite/java/connect/library.db";
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

    public static void main(String[] args) {

        //Calls the database connection code
        dbconnect();

        System.out.printf("Welcome to the library! Please Type '1' Login or '2' Register");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("1")) {
            System.out.printf("Please enter your username");
            String username = scanner.nextLine();
            System.out.printf("Please enter your password");
            String password = scanner.nextLine();
            System.out.printf("Welcome %s", username);
        } else if (input.equals("2")) {
            System.out.printf("Please enter your name");
            String name = scanner.nextLine();
            System.out.printf("Please enter your password");
            String password = scanner.nextLine();
            System.out.printf("Welcome %s", name);
        }





    }
}
