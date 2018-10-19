
//import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.*;

public class DBMS {
    //properties.setProperty("useSSL", "false");
   // private static final String USERNAME="dhana";
     //private static final String PASSWORD="srihny143";
     // private static final String CONN_STRING="jdbc:mysql://localhost:3308/student";
    //  JOptionPane.showMessageDialog(null,"successfully Added");
      
      Connection con=null;
      
      public DBMS() throws ClassNotFoundException, SQLException{
          
          Class.forName("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3308/student","root","srihny143");
          
          
      }
      
      public boolean verifyLogin(String username,String password) throws SQLException{
          
          String sql ="Select * from student_info where UserName=? and password=?";
          
          PreparedStatement pst = con.prepareStatement(sql);
          pst.setString(1, username);
          pst.setString(2, password);
          
         ResultSet set = pst.executeQuery();
   
          return set.next();
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        DBMS dbms = new DBMS();
        
       System.out.println(dbms.verifyLogin("harshi", "1234"));
        
        
    }
    
}
