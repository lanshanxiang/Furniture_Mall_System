package com.example.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test.pojo.Comment;
import com.example.test.service.CommentService;


@Controller
@RequestMapping("/com")
public class CommentController {

	@Autowired
	CommentService service;
	
	/*@RequestMapping("/QuerySpace")
	@ResponseBody
	public String QuerySpacetest(Model model){  
		List<Comment> list = service.selectAll();
		model.addAttribute("list", list);  
		return "success";
		}*/
	@RequestMapping("/Addlogin")
	
	public String Addtest(@Param("id")Integer id,@Param("comment") String comment) throws Exception {

		System.out.println("test11111111111111111111111111111111111111111111111111111111");
		
		System.out.println("id："+id);
		System.out.println("comment："+comment);
		service.insert(id,comment);
		return "success";
	}
	@RequestMapping("/DeleteByName")
	public String DeleteByName(Model model,HttpServletRequest request,
			HttpServletResponse response) throws Exception{  
		Comment com = new Comment();
		int id = Integer.parseInt(request.getParameter("id"));
		String comment = request.getParameter("comment");
		comment=new String(comment.getBytes("ISO-8859-1"),"UTF-8");
		service.deleteByPrimaryKey(id);
		return "success";
	}
	@RequestMapping("/Updatelogin")
	public String Update(@Param("id")Integer id,@Param("comment") String comment) throws Exception {
System.out.println("test11111111111111111111111111111111111111111111111111111111");
		
		System.out.println("id："+id);
		System.out.println("comment："+comment);
		service.updateByPrimaryKey(id,comment);
		return "success";
	}
	@RequestMapping("/addmiddle")
	public String addmiddle(Model model){  
		System.out.println("1111111111111111111111111111111111111111111111111");
		return "addmiddle";
	}
	@RequestMapping("/Deletemiddle")
	public String Delmiddle(Model model){  
		return "delmiddle";
	}
	@RequestMapping("/updatemiddle")
	public String updatemiddle(Model model){  
		return "updatemiddle";
	}
	@RequestMapping("/fail")
	public String logginfail(Model model){  
		return "fail";
	}
}