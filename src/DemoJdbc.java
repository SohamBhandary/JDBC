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
        int sid=102;
        String sname="Maxi";
        int marks=48;

        String url="jdbc:postgresql://localhost:5432/Demo";
        String uname="postgres";
        String pass="0000";
        String sql = "insert into student values (?,?,?)";

//     //   Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");

        PreparedStatement st =con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);
     ;
//        rs.next();
//       String name= rs.getString("sname");
//        System.out.println("Name is :"+ name);
       boolean status= st.execute(sql);
        System.out.println(status);


        con.close();
        System.out.println("connection closed");




        }
    }
