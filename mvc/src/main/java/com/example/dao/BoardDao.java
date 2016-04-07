package com.example.dao;

import java.util.List;

import com.example.model.Board;

public interface BoardDao 
{
	public List<Board> selectAll();
	public Board selectByIdx(int idx);
	
	public int insert(Board board);
	public int update(Board board);
	public int delete(int idx);
	
	public int count();
}
