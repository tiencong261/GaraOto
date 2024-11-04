package model;

import java.sql.*;


public class CustomerDAO {

    private String jdbcURL = "jdbc:mysql://localhost:3306/GARAMAN?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private String jdbcUsername = "root";
    private String jdbcPassword = "1234";

    private static final String SELECT_USER = "SELECT * FROM tblThanhvien183 WHERE username = ? AND password = ?";

    public boolean validate(String username, String password) {
        boolean isValid = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet rs = preparedStatement.executeQuery();

            isValid = rs.next();

            rs.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isValid;
    }

}
