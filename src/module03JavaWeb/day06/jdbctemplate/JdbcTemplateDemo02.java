package module03JavaWeb.day06.jdbctemplate;

import module03JavaWeb.day06.domain.Emp;
import module03JavaWeb.day06.druid.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo02 {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Test
    public void test1(){
        String sql = "update emp set salary = 12000 where id  = ?";
        int update = template.update(sql, 1001);
        System.out.println(update);
    }

    @Test
    public void test2(){
        String sql = "insert into emp(id,ename,dept_id) values(?,?,?)";
        int count = template.update(sql, 1015, "郭靖", 10);
        System.out.println(count);
    }

    @Test
    public void test3(){
        String sql = "delete from emp where id = ?";
        template.update(sql,1015);
    }

    @Test
    public void test4(){
        String sql = "select * from emp where id = ? or id = ?";
        Map<String, Object> emp1 = template.queryForMap(sql, 1001,1002);
        System.out.println(emp1);
        //{id=1001, ename=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=12000.00, bonus=null, dept_id=20}
    }
    @Test
    public void test5(){
        String sql = "select * from emp";
        List<Map<String, Object>> maps = template.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }

    @Test
    public void test6(){
        String sql = "select * from emp";
        List<Emp> query = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();
                emp.setId(rs.getInt("id"));
                emp.setEname(rs.getString("ename"));
                emp.setJob_id(rs.getInt("job_id"));
                emp.setMgr(rs.getInt("mgr"));
                emp.setJoindate(rs.getDate("joindate"));
                emp.setSalary(rs.getDouble("salary"));
                emp.setBonus(rs.getDouble("bonus"));
                emp.setDept_id(rs.getInt("dept_id"));

                return emp;
            }
        });
        for (Emp emp : query) {
            System.out.println(emp);
        }
    }

    @Test
    public void test6_2(){
        String sql = "select * from emp";
        List<Emp> query = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : query) {
            System.out.println(emp);
        }
    }

    @Test
    public void test7(){
        String sql = "select count(id) from emp";
        Long aLong = template.queryForObject(sql, Long.class);
        System.out.println(aLong);
    }


}
