import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class  CrudInJDBC{
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/jdbcconnector";
        String useName = "root";
        String userPassword ="83744";

        Connection con = DriverManager.getConnection(url, useName, userPassword);

        Statement st = con.createStatement();

        //for create table
       String sql = "create table employee(emp_id int primary key,emp_name varchar(20),emp_mail varchar(20),emp_ph int)";

        //for insert values
      //  String sql = "insert into employee values (1, 'anbu', 'anbu@gmail', 1234),(2,'preethi', 'preethi@gmail', '5678'),(3,'dhanush','dhanu@gmail', 87654)";

        //update
     //   String sql = "update employee set emp_ph = 83744 where emp_id = 3";

        //delete
       // String sql = "delete from employee where emp_id = 1";

        int val = st.executeUpdate(sql);
        System.out.println(val + "rows affected");
        con.close();

    }
}