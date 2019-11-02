package com.example.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.dao.RoleMapper;
import com.example.test.pojo.Role;
import com.example.test.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleMapper mapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Role record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public Role selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Role> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	@Override
	public int updateByPrimaryKey(String record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

}
