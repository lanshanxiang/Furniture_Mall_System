package com.example.test.dao;

import com.example.test.pojo.Manager;
import com.example.test.pojo.PageDataResult;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ManagerMapper {
	int deleteByPrimaryKey(@Param("id")Integer id);

    int insert(@Param("id")Integer id, @Param("username")String username,@Param("password")String password,@Param("pid")Integer pid,@Param("zindex")Integer zindex);

    Manager selectByPrimaryKey(@Param("id")Integer id);

    List<Manager> selectAll();

    int updateByPrimaryKey(@Param("id")Integer id, @Param("username")String username,@Param("password")String password,@Param("pid")Integer pid,@Param("zindex")Integer zindex);

	List<Manager> getUserPerms(@Param("id")Integer id);
	
	public PageDataResult getArticles(Manager userSearch, int page, int limit);
	
	int updatePwd (@Param("id")Integer id,@Param("password")String password);
}