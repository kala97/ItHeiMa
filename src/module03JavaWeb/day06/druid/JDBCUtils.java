package module03JavaWeb.day06.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

    private static DataSource ds;

    static {
        try {
            Properties pro = new Properties();
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getconnection() throws SQLException {
        return  ds.getConnection();
    }

    public static DataSource getDataSource(){
        return ds;
    }

    public static void close(PreparedStatement pstmt, Connection conn){
        close(null,pstmt,conn);
    }

    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
