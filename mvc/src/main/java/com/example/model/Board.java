package com.example.model;

import org.springframework.stereotype.Service;

public class Board 
{
	private int idx;
	private String user_id;
	private String user_pw;
	
	public Board() 
	{	
	}

	public Board(String user_id, String user_pw) {
	
		this.user_id = user_id;
		this.user_pw = user_pw;
	}
	
	public Board(int idx, String user_id, String user_pw) {
		this.idx = idx;
		this.user_id = user_id;
		this.user_pw = user_pw;
	}
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	
	
}
