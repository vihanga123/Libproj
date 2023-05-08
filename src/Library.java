import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;


public class Library {

    //Creates the database using sqlite
    public static void dbconnect(){

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

    public static void main(String[] args) {
        books book = new books();
        book.printBooks();


        //Calls the database connection method
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
