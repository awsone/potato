package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbRole;
import com.lzz.potato.pojo.TbRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbRoleMapper {
    int countByExample(TbRoleExample example);

    int deleteByExample(TbRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    List<TbRole> selectByExample(TbRoleExample example);

    TbRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") TbRole record, @Param("example") TbRoleExample example);

    int updateByExample(@Param("record") TbRole record, @Param("example") TbRoleExample example);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);
}