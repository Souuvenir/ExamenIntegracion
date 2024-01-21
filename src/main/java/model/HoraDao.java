package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utils.Conexion;

public class HoraDao {
    public static boolean guardarHora(int idMascota, String rutDueno, String nombreMascota, String hora, String minuto, String dia, String mes, String ano) {
        Connection con;
        Conexion cn = new Conexion();
        PreparedStatement ps;
        boolean success = false;
        String sql = "INSERT INTO tabla_de_horas (id_mascota, rut_dueno, nombre_mascota, hora, minuto, dia, mes, ano) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            ps.setString(2, rutDueno);
            ps.setString(3, nombreMascota);
            ps.setString(4, hora);
            ps.setString(5, minuto);
            ps.setString(6, dia);
            ps.setString(7, mes);
            ps.setString(8, ano);
            
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                success = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return success;
    }
}