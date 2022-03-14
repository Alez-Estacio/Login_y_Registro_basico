
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author diego
 */
public class CONEXION {
     private String USERNAME ="root";
     private String PASSWORD ="";
      private String HOST  ="localhost";
      private String PORT ="3306";
      private  String DATABASE ="ejemplo";
      private String CLASSNAME ="com.mysql.cj.jdbc.Driver";
      private String URL ="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
      private Connection con;

      
      public CONEXION(){
          try {
              Class.forName(CLASSNAME);
              con =DriverManager.getConnection(URL,USERNAME,PASSWORD);
          } catch (ClassNotFoundException e) {
              System.out.println("error"+e);
          } catch (SQLException a){
              System.out.println("Error"+a);
          }
      }
      public  Connection getConexion(){
          return con;
      
      
}
    
}
    

