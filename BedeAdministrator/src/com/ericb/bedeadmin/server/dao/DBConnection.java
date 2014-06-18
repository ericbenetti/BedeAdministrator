package com.ericb.bedeadmin.server.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ericb.bedeadmin.client.ClientApp;

public class DBConnection {

	private Connection conn = null;
	private static DBConnection singleton;
	
	
	public DBConnection() {
		String url = ClientApp.STATIC_PROPERTIES.getProperty("database.url");
		String login = ClientApp.STATIC_PROPERTIES.getProperty("database.login");
		String pswd = ClientApp.STATIC_PROPERTIES.getProperty("database.pswd");
		try {
			setConn(DriverManager.getConnection(url, login, pswd));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DBConnection getInstance() {
		if (singleton==null){
			singleton = new DBConnection();
		}
		return singleton;
	}

	public Connection getConn() {
		return conn;
	}

	private void setConn(Connection conn) {
		this.conn = conn;
	}

	public ResultSet executeQuery(String sql) throws SQLException {
		return  conn.createStatement().executeQuery(sql);
	}
	
	public int executeUpdate(String sql) throws SQLException {
		return  conn.createStatement().executeUpdate(sql);
	}

	public void closeConnection() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
