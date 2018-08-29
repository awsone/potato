package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbRoleMenu;
import com.lzz.potato.pojo.TbRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbRoleMenuMapper {
    int countByExample(TbRoleMenuExample example);

    int deleteByExample(TbRoleMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbRoleMenu record);

    int insertSelective(TbRoleMenu record);

    List<TbRoleMenu> selectByExample(TbRoleMenuExample example);

    TbRoleMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbRoleMenu record, @Param("example") TbRoleMenuExample example);

    int updateByExample(@Param("record") TbRoleMenu record, @Param("example") TbRoleMenuExample example);

    int updateByPrimaryKeySelective(TbRoleMenu record);

    int updateByPrimaryKey(TbRoleMenu record);
}