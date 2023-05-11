import javax.xml.crypto.Data;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;


public class Library {

    //Creates the database using sqlite

    public static void main(String[] args) {
        Database db = new Database();
        Database.LibraryDB();
        Database.bookDB();


        //Calls the database connection method


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
