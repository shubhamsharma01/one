package com.nucleus.connection;
//Program to create Connection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//public class to setup connection
public class ConnectionSetup 
{
	Connection con;
	
	//Method to get connection
	public  Connection getConnection()
	{
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1521:orcl","sh","sh");
	con.setAutoCommit(false);
	}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
    }
	
	//Method To close connection
    public void closeConnection()
	{
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	
	

}
