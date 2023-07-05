package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.FetchModel;

public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static int savedata(FetchModel m)
	{
		Connection con = Dao.getconnect();
		int status =0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into data(fname,lname,email,mobile,gender,password) values(?,?,?,?,?,?)");
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getEmail());
			ps.setString(4,m.getMobile());
			ps.setString(5,m.getGender());
			ps.setString(6,m.getPassword());
			
			
			status = ps.executeUpdate();
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

}
