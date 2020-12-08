package com.javatpoint.dao;


import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  

public class LoginDAO {

	public static boolean validate(String username,String userpass){
		
		boolean status=false;  
		
		try{  
		   
			//Class.forName("oracle.jdbc.driver.OracleDriver");  
			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			
			Class.forName("org.mariadb.jdbc.Driver"); 
			//Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test?user=gmocontrolactivo_usuario&password=gmocontrolactivo_password");
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","gmocontrolactivo_usuario","gmocontrolactivo_password");
		    
			//los signos de ? son sustituidos por las posiciones definidas por ps.setString()
			PreparedStatement ps=con.prepareStatement("select * from usuarios where nombre=? and password=?");  
			
			ps.setString(1,username);  
			ps.setString(2,userpass);  
			
			ResultSet rs=ps.executeQuery();  
			status=rs.next();  
		}
		catch(Exception e){
			e.printStackTrace();
		}  
		return status;  
	}  
}
