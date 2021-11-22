
package Conexiones;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Familia Vazquez
 */
public class Conexion {
    
   static Connection contacto = null;
   
   public static Connection getConexion()
   {
       String url = "jdbc:sqlserver://localhost:1433;databaseName=appbank";
       
       try
       {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // seleccionamos la clase driver
           JOptionPane.showMessageDialog(null, "SE PUEDO HACER LA CONEXION");
       }catch (ClassNotFoundException e)
       {
          JOptionPane.showMessageDialog(null, "NO SE PUEDO HACER LA CONEXION");
          JOptionPane.showMessageDialog(null, "No se pudo establece la conexion... revisar Driver" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
       }
       
       try
       {
           contacto = DriverManager.getConnection(url,"administrador","5555");
           JOptionPane.showMessageDialog(null, "SE PUEDO HACER LA CONEXION");
       }catch(SQLException e)
       {
            JOptionPane.showMessageDialog(null, "No se pudo establece la conexion... revisar la conexion" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
           System.out.println(e.toString());
       }
       return contacto;
   }
}
