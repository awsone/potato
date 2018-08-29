package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbMenu;
import com.lzz.potato.pojo.TbMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbMenuMapper {
    int countByExample(TbMenuExample example);

    int deleteByExample(TbMenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(TbMenu record);

    int insertSelective(TbMenu record);

    List<TbMenu> selectByExample(TbMenuExample example);

    TbMenu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") TbMenu record, @Param("example") TbMenuExample example);

    int updateByExample(@Param("record") TbMenu record, @Param("example") TbMenuExample example);

    int updateByPrimaryKeySelective(TbMenu record);

    int updateByPrimaryKey(TbMenu record);
}