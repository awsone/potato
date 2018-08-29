package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbToreward;
import com.lzz.potato.pojo.TbTorewardExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbTorewardMapper {
    int countByExample(TbTorewardExample example);

    int deleteByExample(TbTorewardExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(TbToreward record);

    int insertSelective(TbToreward record);

    List<TbToreward> selectByExample(TbTorewardExample example);

    TbToreward selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") TbToreward record, @Param("example") TbTorewardExample example);

    int updateByExample(@Param("record") TbToreward record, @Param("example") TbTorewardExample example);

    int updateByPrimaryKeySelective(TbToreward record);

    int updateByPrimaryKey(TbToreward record);
}