import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        DbManager dbManager = new DbManager();
        Balance balance= new Balance();
        balance.deposit();
        dbManager.insert();
        dbManager.selectProduct();
        BasePayment payment = new PaymentMethods() {
            @Override
            public void glnrBalance() {

            }
        };



    }
}
