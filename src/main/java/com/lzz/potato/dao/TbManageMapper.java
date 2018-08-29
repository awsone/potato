package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbManage;
import com.lzz.potato.pojo.TbManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbManageMapper {
    int countByExample(TbManageExample example);

    int deleteByExample(TbManageExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(TbManage record);

    int insertSelective(TbManage record);

    List<TbManage> selectByExample(TbManageExample example);

    TbManage selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") TbManage record, @Param("example") TbManageExample example);

    int updateByExample(@Param("record") TbManage record, @Param("example") TbManageExample example);

    int updateByPrimaryKeySelective(TbManage record);

    int updateByPrimaryKey(TbManage record);
}