package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbAchieve;
import com.lzz.potato.pojo.TbAchieveExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbAchieveMapper {
    int countByExample(TbAchieveExample example);

    int deleteByExample(TbAchieveExample example);

    int deleteByPrimaryKey(Integer acId);

    int insert(TbAchieve record);

    int insertSelective(TbAchieve record);

    List<TbAchieve> selectByExample(TbAchieveExample example);

    TbAchieve selectByPrimaryKey(Integer acId);

    int updateByExampleSelective(@Param("record") TbAchieve record, @Param("example") TbAchieveExample example);

    int updateByExample(@Param("record") TbAchieve record, @Param("example") TbAchieveExample example);

    int updateByPrimaryKeySelective(TbAchieve record);

    int updateByPrimaryKey(TbAchieve record);
}