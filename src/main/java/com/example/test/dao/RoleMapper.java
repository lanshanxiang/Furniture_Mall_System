package com.example.test.dao;

import com.example.test.pojo.Role;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    Role selectByPrimaryKey(Integer id);

    List<Role> selectAll();

    int updateByPrimaryKey(String record);
}