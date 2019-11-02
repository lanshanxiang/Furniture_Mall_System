package com.example.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.pojo.Role;
import com.example.test.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	RoleService service;
	
	@RequestMapping("/select")
	@ResponseBody
	public String select() {
		List<Role> list = service.selectAll();
		return ""+list.size();
	}
	@RequestMapping("/update")
	@ResponseBody
	public ModelAndView queryAll(){
	    ModelAndView model = new ModelAndView();
	    model.setViewName("index");    //你要跳转html的名字
	    return model;
	}
}
