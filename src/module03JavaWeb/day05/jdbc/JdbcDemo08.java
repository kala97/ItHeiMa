package module03JavaWeb.day05.jdbc;

import module03JavaWeb.day05.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class JdbcDemo08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please input your username:");
        String username = in.nextLine();
        System.out.println("please input your password:");
        String password = in.nextLine();
        JdbcDemo08 jdbcDemo08 = new JdbcDemo08();
        boolean login2 = jdbcDemo08.login2(username, password);
        if (login2){
            System.out.println("login succeed!");
        }else System.out.println("please check you username or password!");
    }

    public boolean login(String username,String password){

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "select * from user where username = '"+username+"'and password = '"+password+"'";
            rs = stmt.executeQuery(sql);
            return rs.next();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }
        return false;
    }

    public boolean login2(String username,String password){

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = ? and password = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();
            return rs.next();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,conn);
        }
        return false;
    }
}
