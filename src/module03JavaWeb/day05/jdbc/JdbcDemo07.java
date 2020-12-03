package module03JavaWeb.day05.jdbc;

import module03JavaWeb.day05.domain.Emp;
import module03JavaWeb.day05.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo07 {
    public static void main(String[] args) {
        List<Emp> list = new JdbcDemo06().findAll();
        System.out.println(list);
    }

    /**
     *
     * @return
     */
    public List<Emp> findAll(){
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        List<Emp> list = null;
        try {
            JDBCUtils.getConnection();
            String sql = "select * from emp";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            Emp emp = null;
            list = new ArrayList<>();
            while (rs.next()){
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                list.add(emp);
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }

        return list;
    }
}
