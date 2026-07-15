import java.sql.*;

public class Main2 {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/jdbcconnector";
        String userName = "root";
        String userPassword = "83744";
        Connection con = DriverManager.getConnection(url, userName, userPassword);
        int rno = 4;
        String name = "vijay";
        String location = "hyderabad";
        String sql = "insert into student values (?,?,?)";

     //   String sql = "select * from student where rno = ?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,4);
        st.setInt(1,rno);
        st.setString(2,name);
        st.setString(3,location);
        st.executeUpdate();
//         ResultSet rs =  st.executeQuery();
//        while(rs.next()) {
//            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
//        }
        con.close();

    }
}
