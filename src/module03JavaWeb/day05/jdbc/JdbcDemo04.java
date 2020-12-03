package module03JavaWeb.day05.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo04 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "cky713237");
            String sql = "delete from emp where id = 1015";
            stmt = conn.createStatement();
            int i = stmt.executeUpdate(sql);
            if (i>0){
                System.out.println("修改成功");
            }else System.out.println("修改失败");
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
