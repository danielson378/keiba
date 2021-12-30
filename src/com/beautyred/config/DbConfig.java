package com.beautyred.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;


public class DbConfig {

	private static DbConfig instance;
	private String strDbUrl;
	private String strDbUser;
	private String strDbPassWord;

	// インスタンスを取得
	public static DbConfig getInstance() {
		if (instance == null) {
			return new DbConfig();
		} else {
			return instance;
		}
	}

	// privateコンストラクタ
	private DbConfig() {
		this.loadProperties();
		instance = this;
	}

	private void loadProperties() {
		ResourceBundle resource = ResourceBundle.getBundle("db");

		strDbUrl = resource.getString("db.url");
		strDbUser = resource.getString("db.user");
		strDbPassWord = resource.getString("db.pw");
	}

	public Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connet = DriverManager.getConnection(strDbUrl, strDbUser, strDbPassWord);
			return connet;
		}catch (Exception e) {
			throw new Exception("DB接続失敗",e);
		}
	}

}
