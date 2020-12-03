package module03JavaWeb.day05.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo01 {
    public static void main(String[] args) throws Exception {

//        Class.forName("com.mysql.cj.jdbc.Driver");

//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "cky713237");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "cky713237");

        String sql = "update emp set salary = 8000 where id = 1001";

        Statement stmt = conn.createStatement();

        int count = stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();
        conn.close();
    }
}
