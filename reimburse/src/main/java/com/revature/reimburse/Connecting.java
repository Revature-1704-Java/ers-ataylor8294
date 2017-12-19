package com.revature.reimburse;
import java.io.*;
import java.util.Properties;
import java.sql.*;
public class Connecting  {
		public static Connection getConnection() throws SQLException, IOException{
			Properties pro = new Properties();
			InputStream in = new FileInputStream("connection.properties");
			pro.load(in);
			String url = pro.getProperty("url");
			String user = pro.getProperty("username");
			String password = pro.getProperty("password");
			Connection connect = DriverManager.getConnection(url , user, password);
			return connect;
			
		
		
	}
}
