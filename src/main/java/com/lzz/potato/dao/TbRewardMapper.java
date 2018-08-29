package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbReward;
import com.lzz.potato.pojo.TbRewardExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbRewardMapper {
    int countByExample(TbRewardExample example);

    int deleteByExample(TbRewardExample example);

    int deleteByPrimaryKey(Integer reId);

    int insert(TbReward record);

    int insertSelective(TbReward record);

    List<TbReward> selectByExample(TbRewardExample example);

    TbReward selectByPrimaryKey(Integer reId);

    int updateByExampleSelective(@Param("record") TbReward record, @Param("example") TbRewardExample example);

    int updateByExample(@Param("record") TbReward record, @Param("example") TbRewardExample example);

    int updateByPrimaryKeySelective(TbReward record);

    int updateByPrimaryKey(TbReward record);
}