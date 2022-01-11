package com.beautyred.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * クラス名：JockeyNoDto
 *  <br>
 * 概要：騎手番号情報クラス
 * <br>
 */
public class JockeyNoDto {

	 /** 騎手番号 */
	String user;
	private List<String> aryUser = new ArrayList<String>();

	public List<String> getAryUser() {
		return aryUser;
	}

	public void setAryUser(List<String> aryUser) {
		this.aryUser = aryUser;
	}




}
