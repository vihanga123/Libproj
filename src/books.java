import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
public class books {
    String[] books = {"The Lord of the Rings", "Harry Potter", "The Hobbit", "Jane Eyre"};
        public void printBooks(){
            Database db = new Database();


            System.out.println(Arrays.toString(books));


        }
}



