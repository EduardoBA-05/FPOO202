/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD {
    
    private Connection conexion;
    public UserCRUD(){
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean crearUsuario(String nom,String cor, String contra){
        String sqlInsert = "INSERT INTO usuarios(nombre,correo,contrasena) VALUE(?,?,?)"; // se crea una variable para leer/almacenar los valores ingresados en la base de datos
       
// Se utiliza para el manejo de las excepciones, EN caso de error no se rompe el código, ya que esta
       // estructura permite controlar las excepciones y/o errores.
        
       try{
            PreparedStatement ps = conexion.prepareStatement(sqlInsert);
            ps.setString(1, nom); 
            ps.setString(2, cor);
            ps.setString(3, contra);
            return ps.executeUpdate()> 0; 
              } //try
       catch(SQLException e){ // SQLException e en caso de que no se inserten los valores
                    System.out.println("Error al intentar insertar"+ e.getMessage());
                    return false;
                    }//catch

        
    } // fin del insert
    
    // ResultSet es como un arreglo, que interactúa como un obejto, el cual obtiene un resultado de una consulta
    public ResultSet obtenerUsuarioPorID(int id){
        String selectSql = "SELECT * FROM usuarios WHERE id = ?"; // El ? indica 
        //que posteriormente se definirá ese valor
        
        try{
            PreparedStatement ps = conexion.prepareStatement(selectSql);
            ps.setInt(1, id);//1 intercambia el valor propuesto como ? en el de sql
            return ps.executeQuery();
        }
        catch(SQLException e){ // e es un objeto
            System.out.println("Error al intentar consultar"+ e.getMessage());
                    return null;
        }
    } // fin Obtener usuario por id
    
    public ResultSet obtenerTodos(){
    String sqlTodos = "SELECT * FROM usuarios";    
    
    try {
        PreparedStatement ps = conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
    }
    catch(SQLException w){
        System.out.println("Error al consultar"+ w.getMessage());
        return null;
    }
    
    }// obtenerTodos

public boolean actualizarUsuario(int id, String nom, String cor, String contra) {
    String sqlUpdate = "UPDATE usuarios SET nombre = ?, correo = ?, contrasena = ? WHERE id = ?";
    
    try {
        PreparedStatement ps = conexion.prepareStatement(sqlUpdate);
        ps.setString(1, nom);
        ps.setString(2, cor);
        ps.setString(3, contra);
        ps.setInt(4, id);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        System.out.println("Error al actualizar: " + e.getMessage());
        return false;
    }
} // actualizarUsuario

}