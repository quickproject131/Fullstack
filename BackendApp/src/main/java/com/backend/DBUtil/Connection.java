package com.backend.DBUtil;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connection {
	private static Connection connection = null;
	public static Connection getConnection() {
		if (connection != null)
			return connection;
		else {

			try {
				String driver="com.mysql.cj.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/college?useSSL=false";
				String user="root";
				String password="123456789";
				Class.forName(driver);
				connection=(Connection) DriverManager.getConnection(url,user,password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			return connection;
		}

	}
 
}
