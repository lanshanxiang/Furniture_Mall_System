package com.example.test.dao;

import com.example.test.pojo.Permission;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PermissionMapper {
	  int deleteByPrimaryKey(@Param("id")Integer id);

	    int insert(@Param("id")Integer id, @Param("name")String name,@Param("pid")Integer pid,@Param("zindex")Integer zindex,@Param("istype")Integer istype,@Param("descpt")String descpt,@Param("code")String code,@Param("icon")String icon,@Param("page")String page,@Param("insert_time")Timestamp insert_time,@Param("update_time")Timestamp update_time);

	    Permission selectByPrimaryKey(@Param("id")Integer id);

	    List<Permission> selectAll();

		List<Permission> getUserPerms(@Param("id")Integer id);

		int updateByPrimaryKey(@Param("id")Integer id,@Param("name") String name, @Param("pid")Integer pid, @Param("zindex")Integer zindex, @Param("istype")Integer istype, @Param("descpt")String descpt,
				@Param("code")String code, @Param("icon")String icon, @Param("page")String page,@Param("insert_time") Timestamp insert_time, @Param("update_time")Timestamp update_time);
}