import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try{
            DbHelper helper = new DbHelper();
            connection= helper.getConnection();
            System.out.println("Connection Successfull!");
        } catch (SQLException exception){
            System.out.println(exception.getMessage());
        }




    }
}
