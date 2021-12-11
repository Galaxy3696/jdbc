package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbctest {

    public static void main(String[] args) throws Exception{

       // Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://127.0.0.1:3306/db1";
        String username="root";
        String password="001041";
        Connection conn=DriverManager.getConnection(url,username,password);

        String sql="UPDATE stu SET age = 50 WHERE id=2";
        Statement st=conn.createStatement();

        int count = st.executeUpdate(sql);
        System.out.println(count);
        st.close();
        conn.close();
    }
}
