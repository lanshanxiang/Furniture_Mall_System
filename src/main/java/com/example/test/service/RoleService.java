package com.example.test.service;

import com.example.test.pojo.Role;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

public interface RoleService {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    Role selectByPrimaryKey(Integer id);

    List<Role> selectAll();

    int updateByPrimaryKey(String record);
}