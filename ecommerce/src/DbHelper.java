import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName = "root";
    private String password = "123456";
    private String dbUrl = "jdbc:mysql://127.0.0.1:3306/Product?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    ;

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }
}

