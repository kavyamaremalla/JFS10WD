import java.sql.*;

public class JDBCConnector {
    public static void main(String[] args) {

        String query = "select * from college.persondetails";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/college?user=root&password=Password!123");

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

//        System.out.println(resultSet);

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3) + " " +
                        resultSet.getBoolean(4));
            }

            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
