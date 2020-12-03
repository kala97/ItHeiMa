package module03JavaWeb.day05.jdbc;

import java.sql.*;

public class JdbcDemo05 {
    public static void main(String[] args) {
    Statement stmt = null;
    Connection conn = null;
    ResultSet rs = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "cky713237");
        String sql = "select * from emp";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);

        //处理结果
        while (rs.next()){
//            rs.next();
            int id = rs.getInt(1);
            String ename = rs.getString("ename");
            int jobId = rs.getInt(3);

            System.out.println(id+"----"+ename+"----"+jobId);
        }
//        rs.next();
//        int id = rs.getInt(1);
//        String ename = rs.getString("ename");
//        int jobId = rs.getInt(3);
//
//        System.out.println(id+"----"+ename+"----"+jobId);

    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    } finally {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
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
