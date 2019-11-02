package com.example.test.dao;

import com.example.test.pojo.PageDataResult;
import com.example.test.pojo.Product;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProductMapper {
	int deleteByPrimaryKey(@Param("id")Integer id);

    int insert(@Param("id")Integer id, @Param("name")String name,@Param("description")String description,@Param("price")Double price,@Param("date")Timestamp date,@Param("permise")String permise);

    Product selectByPrimaryKey(@Param("id")Integer id);

    List<Product> selectAll();

    int updateByPrimaryKey(@Param("id")Integer id, @Param("name")String name,@Param("description")String description,@Param("price")Double price,@Param("date")Timestamp date,@Param("permise")String permise);

	List<Product> permList();
	public PageDataResult getArticles(Product userSearch, int page, int limit);
	
	//public PageDataResult getPermissionById(Permission userSearch, int page, int limit,@Param("id")Integer id);
	List<Product> getUserPerms(@Param("id")Integer id);
}