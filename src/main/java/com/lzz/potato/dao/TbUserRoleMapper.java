package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbUserRole;
import com.lzz.potato.pojo.TbUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbUserRoleMapper {
    int countByExample(TbUserRoleExample example);

    int deleteByExample(TbUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserRole record);

    int insertSelective(TbUserRole record);

    List<TbUserRole> selectByExample(TbUserRoleExample example);

    TbUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserRole record, @Param("example") TbUserRoleExample example);

    int updateByExample(@Param("record") TbUserRole record, @Param("example") TbUserRoleExample example);

    int updateByPrimaryKeySelective(TbUserRole record);

    int updateByPrimaryKey(TbUserRole record);
}