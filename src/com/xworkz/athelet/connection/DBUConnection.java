package com.xworkz.athelet.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.xworkz.athelet.constant.MySqlPropertie.*;

public class DBUConnection {

	public static Connection getConnection() throws SQLException
	{
		return
				DriverManager.getConnection(URL.getVal(),USERNAME.getVal(),PASSWORD.getVal());
				
	}
	
}
