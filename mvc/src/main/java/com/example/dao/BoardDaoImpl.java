package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.Board;

@Repository
public class BoardDaoImpl implements BoardDao
{		
	private JdbcTemplate jdbcTemplate;	
	
	@Autowired
	public void setDataSource(DataSource dataSource) 
	{
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private RowMapper<Board> rowMapper = new RowMapper<Board>()
	{
		@Override
		public Board mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			Board board = new Board(rs.getInt("idx"), rs.getString("user_id"), rs.getString("user_pw") );			
			return board;
		}		
	};
	
	@Override
	public int count() {
		String sql = " SELECT count(*) FROM board ";
		return jdbcTemplate.queryForInt(sql);
	}

	@Override
	public Board selectByIdx(int idx) {
		String sql = " SELECT * FROM board WHERE idx="+idx;		
		return jdbcTemplate.queryForObject(sql, new Object[]{}, rowMapper);
	}

	@Override
	public List<Board> selectAll() 
	{
		String sql = " SELECT * FROM board  ";
		return jdbcTemplate.query(sql, rowMapper);
	}
	
	@Override
	public int insert(Board board) 
	{	
		String sql = " INSERT INTO board(user_id,user_pw) values(?,?) ";		
		return jdbcTemplate.update(sql,new Object[]{
				board.getUser_id(),
				board.getUser_pw()				
		});
	}
	
	@Override
	public int update(Board board) {
		String sql = " UPDATE board SET user_id=?,user_pw=? WHERE idx=" + board.getIdx();	
		System.out.println(sql);
		return	jdbcTemplate.update(sql, new Object[]{
				board.getUser_id(),
				board.getUser_pw()				
		});
	}

	@Override
	public int delete(int idx) {
		String sql = " DELETE FROM board WHERE idx="+idx ;		
		return jdbcTemplate.update(sql);
	}



	
}
