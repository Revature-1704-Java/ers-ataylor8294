package com.revature.reimburse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ExpenseDao {
	public static void login() {
		PreparedStatement ps = null;
		ResultSet rs=null;
		try(Connection conn =Connecting.getConnection()){
			System.out.println("connected");
			String sql = "SELECT * FROM employees e WHERE e.firstname = ? AND e.lastname=?";
			ps = conn.prepareStatement(sql);
			System.out.println("Please input your username and password");
			Scanner scan = new Scanner(System.in);
			String  name1 = scan.next();
			String name2 = scan.next();
			ps.setString(1, name1);
			ps.setString(2, name2);
			rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("congragulations you are logged in");
			}
		}
		catch(Exception e) {
			System.out.println("failed");
			e.printStackTrace();
		}
		finally {
			if (ps != null) {
				try {
					ps.close();
				}
				catch(Exception e) {
					
				}
			}
		}
	 if (rs!=null) {
		 try {
			 rs.close();
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
	}
	public static void creatform() {
		PreparedStatement ps= null;
		ResultSet rs = null;
		try(Connection conn =Connecting.getConnection()){
			System.out.println("connected");
			String sql = "insert into values(?, ?,?,?,0,?)";
			ps = conn.prepareStatement(sql);
			System.out.println("Please input your username and password");
			Scanner scan = new Scanner(System.in);
			int id=scan.nextInt();
			ps.setInt(1, id);
			String name = scan.next();
			ps.setString(2, name);
			int amount=scan.nextInt();
			ps.setInt(3, amount);
			int manager = scan.nextInt();
			ps.setInt(4, manager);
			rs = ps.executeQuery();

		}
		catch(Exception E) {
			
		}
	}
	public static void approveform() {
		PreparedStatement ps = null;
		ResultSet rs= null;
		try(Connection conn =Connecting.getConnection()){
			
		}
		catch(Exception E) {
			
		}
	}
	public static void managerview() {
		PreparedStatement ps =null;
		ResultSet rs = null;
		try(Connection conn =Connecting.getConnection()){
			
		}
		catch(Exception E) {
			
		}
	}
}
