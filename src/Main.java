import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        /*
        *   1.import the package
        *   2.drive class
        *   3.establish connection
        *   4.create statement
        *   5.execute statement
        *   6.process the result
        *   7.close the connection
        * */

        String url = "jdbc:mysql://localhost:3306/jdbcconnector ";
        String userName = "root";
        String userPassword = "83744";
        Connection conn = DriverManager.getConnection(url, userName, userPassword);

        Statement st = conn.createStatement();
        String sql = " select * from student ";
        
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {     //skipping the header
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        st.close();

    }
}