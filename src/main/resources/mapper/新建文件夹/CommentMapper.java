package com.example.test.dao;

import com.example.test.pojo.Comment;
import com.example.test.pojo.PageDataResult;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CommentMapper {
	  int deleteByPrimaryKey(@Param("id")Integer id);

	    int insert(@Param("id")int id,@Param("comment") String comment);

	    Comment selectByPrimaryKey(@Param("id")Integer id);

	    List<Comment> selectAll();

		int updateByPrimaryKey(@Param("id")Integer id, @Param("comment")String comment);
		
		 public PageDataResult getArticles(Comment userSearch, int page, int limit);
}