package module03JavaWeb.day06.jdbctemplate;

import module03JavaWeb.day06.druid.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateDemo01 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql = "update account set balance = 5000 where id = ?";
        int count = template.update(sql, 3);
        System.out.println(count);
    }
}
