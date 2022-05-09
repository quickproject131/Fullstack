package com.backend.DBUtil;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connection {

	private static Connection connection = null;
	
	public static Connection getConnection() {
		if(connection!=null)
		{
			return connection;
		}else
		{
			try {
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/college";
				String user = "root";
				String password = "123456789";
				
				Class.forName(driver);
			    connection = (Connection) DriverManager.getConnection(url,user,password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return connection;
	}
 
}
