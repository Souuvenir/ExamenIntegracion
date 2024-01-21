package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utils.Conexion;

public class LoginDao {
	public static String validar(String username, String password) {
		Connection con;
		Conexion cn = new Conexion();
		PreparedStatement ps;
		ResultSet rs;
		boolean val = false;
		String rut = "";
		String sql = "select rut from usuario where username = ? and password = ?";
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			rs=ps.executeQuery();
			while(rs.next()) {
				val = true;
				
				rut = rs.getString("rut");
			}
		}catch(Exception e){System.out.println(e);}
		return rut;
	}
}
