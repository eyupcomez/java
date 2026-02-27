import java.sql.*;

public class DbManager {
    Connection connection = null;
    PreparedStatement statement = null;
    Statement statementSelect = null;
    ResultSet resultSet;

    public void selectProduct() throws SQLException {

        try {
            DbHelper helper = new DbHelper();
            connection = helper.getConnection();
            System.out.println("Connection Successfull!");
            statementSelect = connection.createStatement();
            resultSet = statementSelect.executeQuery("select * from BeautyProducts;");
            while (resultSet.next()) {

                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");

                System.out.println(name + " - " + price);
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }


    }

    public void insert() {

        try {
            DbHelper helper = new DbHelper();
            connection = helper.getConnection();
            System.out.println("Connection Successful!");

            statement = connection.prepareStatement(
                    "insert into BeautyProducts (name, price, id) values (?, ?)"
            );

            statement.setString(1, "Perfume");
            statement.setDouble(2, 500);


            int result = statement.executeUpdate();
            System.out.println("Inserted rows: " + result);

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
