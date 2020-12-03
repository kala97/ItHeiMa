package module03JavaWeb.day05.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo02 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "insert into emp values(1015,'刘备',1,null,'2001-11-17',50000,null,10)";
            conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "cky713237");
            stmt = conn.createStatement();
            int count = stmt.executeUpdate(sql);
            System.out.println(count);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
