import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) throws SQLException {
        //Create connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "[DB_NAME]","[YOUR USER]","[YOUR PASSWORD");
        //Create Statement
        Statement statement = conn.createStatement();
        //Execute Query
        ResultSet rs = statement.executeQuery("select * from emp");
        //Print the set
        while(rs.next()){
        }
    }
}
