package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbApply;
import com.lzz.potato.pojo.TbApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbApplyMapper {
    int countByExample(TbApplyExample example);

    int deleteByExample(TbApplyExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(TbApply record);

    int insertSelective(TbApply record);

    List<TbApply> selectByExample(TbApplyExample example);

    TbApply selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") TbApply record, @Param("example") TbApplyExample example);

    int updateByExample(@Param("record") TbApply record, @Param("example") TbApplyExample example);

    int updateByPrimaryKeySelective(TbApply record);

    int updateByPrimaryKey(TbApply record);
}