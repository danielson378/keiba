package com.beautyred.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.beautyred.config.DbConfig;

public class LoginService {

    /** SQL文 */
	private interface SQL{
		String SELECT = "select * from admin where name=? and pw=?";
	}

	 private boolean adminCheack(String user,String pw) throws Exception {
	    	boolean flag = false;

	    	String sql = SQL.SELECT;

	    	DbConfig dbConfig = DbConfig.getInstance();
	    	Connection conn = null;
	    	PreparedStatement ps = null;
	    	ResultSet rs = null;
	    	conn = dbConfig.getConnection();

	    	try {
	    		ps = conn.prepareStatement(sql);
	    		ps.setString(1, user);
	    		ps.setString(2, pw);

	    		rs = ps.executeQuery();
	    		if (rs.next() == true) {
	    			// rsはnullでなければデータがある
	    			flag = true;

	    		}
	    	} catch (SQLException e) {
	    		e.printStackTrace();
	    	}

	    	return flag;
	    }
}
