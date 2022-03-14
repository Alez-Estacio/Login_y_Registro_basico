
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CONSULTAS extends CONEXION
{
   public boolean autenticacion(String nombre, String pass) throws SQLException{
       PreparedStatement pst = null;
       ResultSet rs = null;
       try {
           String consulta = "select*from tbusuario where nombreUsuario=? and contraseña = ?";
           pst = getConexion().prepareStatement(consulta,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           pst.setString(1, nombre);
           pst.setString(2, pass);
           rs = pst.executeQuery();
           if (rs.absolute(1)) {
               return true;
               
           }
       } catch (Exception e) {
           System.out.println("Error"+e);
       }finally{
           try {
               if (getConexion()!=null) { getConexion().close();
               if (pst !=null) pst.close();
               if (rs !=null) rs.close();
               }
               
           } catch (Exception e) {
               System.out.println("Error" +e);
               
           }
               
           }
       
           
    
       
       return false;
   }
    
    
    
   public boolean registrar(String nombre, String apellido,String correo, String contraseña){
       PreparedStatement pst = null;
       try {
           String consulta = ("insert into tbusuario (nombreUsuario,apellidoUsuario,correo,contraseña) values (?,?,?,?)");
           pst=getConexion().prepareStatement(consulta);
           pst.setString(1, nombre);
            pst.setString(2, apellido);
           pst.setString(3, correo);
           pst.setString(4,contraseña);           
           
           if (pst.executeUpdate() ==1) {
               return true;
               
           }
       } catch (Exception f) {
           System.out.println("Error"+f);
           
       } finally{
           try {
                if(getConexion() !=null) getConexion().close();
                if (pst !=null) pst.close();
           } catch (Exception F) {
               System.out.println("Error"+F);
           }
         
       }
       return false;
   }
 
}




