package module03JavaWeb.day06.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo1 {
    public static void main(String[] args) throws SQLException {
        DataSource ds = new ComboPooledDataSource();

        for (int i = 0; i < 12; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i +":"+ conn);
        }

    }
}
