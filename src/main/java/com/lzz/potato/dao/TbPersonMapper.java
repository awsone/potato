package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbPerson;
import com.lzz.potato.pojo.TbPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbPersonMapper {
    int countByExample(TbPersonExample example);

    int deleteByExample(TbPersonExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(TbPerson record);

    int insertSelective(TbPerson record);

    List<TbPerson> selectByExample(TbPersonExample example);

    TbPerson selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") TbPerson record, @Param("example") TbPersonExample example);

    int updateByExample(@Param("record") TbPerson record, @Param("example") TbPersonExample example);

    int updateByPrimaryKeySelective(TbPerson record);

    int updateByPrimaryKey(TbPerson record);
}