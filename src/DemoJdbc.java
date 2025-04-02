import  java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        /*
              import package
        load and register
        create connection
        create statement
        execute statement
        process the results
        close
        */
        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pass="0000";
        String sql="select sname from student where sid=1";
//        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");
        Statement st =con.createStatement();
       ResultSet rs=  st.executeQuery(sql);
        rs.next();
       String name= rs.getString("sname");
        System.out.println("Name is :"+ name);

        con.close();
        System.out.println("connection closed");




        }
    }
