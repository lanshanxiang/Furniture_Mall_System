package com.example.test.dao;

import com.example.test.pojo.role;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface roleMapper {
	int deleteByPrimaryKey(@Param("id")Integer id);

    int insert(role record);

    role selectByPrimaryKey(@Param("id")Integer id);

    List<role> selectAll();

    int updateByPrimaryKey(@Param("record")String record);
}