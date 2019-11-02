package com.example.test.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.sql.DataSource;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test.pojo.Comment;
import com.example.test.pojo.User;
import com.example.test.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	UserService service;
	
	@RequestMapping("/login")

	public String queryAll(){
		return "home";
	}
	/*@RequestMapping("/logins")
	@ResponseBody
	public String logins(@Param("username")String username,@Param("password") String password) {  
		
		jdbcTemplate = new JdbcTemplate(dataSource);
		String userAccountSql="select password from user where username='"+username+"'";

		String userAccount=(String)jdbcTemplate.queryForObject(userAccountSql, String.class);

		if(password.equals(userAccount)) {
			return "success";
		}else {
			return "fail";
		}
	}*/
	@RequestMapping("/logins")
	@ResponseBody
		public String logins(@Param("username")String username,@Param("password") String password) {
		String pwd =  service.selectByPassword(username);
		System.out.println(pwd);
		return pwd;
	}
}

