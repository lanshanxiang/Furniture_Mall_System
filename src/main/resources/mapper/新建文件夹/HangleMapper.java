package com.example.test.dao;

import com.example.test.pojo.Hangle;
import com.example.test.pojo.PageDataResult;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HangleMapper {
	int deleteByPrimaryKey(@Param("id")Integer id);

    int insert(@Param("id")Integer id, @Param("name")String name,@Param("firm")String firm,@Param("consumer")String consumer,@Param("ship")String ship,@Param("delivery")String delivery,@Param("logistics")String logistics);

    Hangle selectByPrimaryKey(@Param("id")Integer id);

    List<Hangle> selectAll();

    int updateByPrimaryKey(@Param("id")Integer id, @Param("name")String name,@Param("firm")String firm,@Param("consumer")String consumer,@Param("ship")String ship,@Param("delivery")String delivery,@Param("logistics")String logistics);

    public PageDataResult getArticles(Hangle userSearch, int page, int limit);
    
	List<Hangle> getUserPerms(@Param("id")Integer id);
}