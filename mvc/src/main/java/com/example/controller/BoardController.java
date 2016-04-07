package com.example.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.BoardDao;
import com.example.dao.BoardDaoImpl;
import com.example.model.Board;

@Controller
public class BoardController 
{	
	@Autowired
	private BoardDaoImpl dao;

	@RequestMapping( value={"/","list.do"} )
	public ModelAndView getList()
	{
		ModelAndView mav = new ModelAndView();
		
		List<Board> arr = dao.selectAll();
		mav.addObject("arr", arr);
		mav.setViewName("list");	
		
		return mav;
	}
	
	@RequestMapping("/detail.do")
	public ModelAndView getDetail(@RequestParam("idx") int idx)
	{		
		ModelAndView mav = new ModelAndView();
		
		Board board = dao.selectByIdx(idx);	
		mav.addObject("board", board);
		mav.setViewName("detail");		
		return mav;
	}	
	@RequestMapping("write.do")
	public String write()
	{		
		return "write";
	}
	
	@RequestMapping("db_insert.do")
	public void db_insert(@RequestParam() String user_id, @RequestParam String user_pw)
	{
		Board board = new Board(user_id, user_pw);
		
		int rst = dao.insert(board);
					
		getList();
	}
}











