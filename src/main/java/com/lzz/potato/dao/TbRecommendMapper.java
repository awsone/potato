package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbRecommend;
import com.lzz.potato.pojo.TbRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbRecommendMapper {
    int countByExample(TbRecommendExample example);

    int deleteByExample(TbRecommendExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(TbRecommend record);

    int insertSelective(TbRecommend record);

    List<TbRecommend> selectByExample(TbRecommendExample example);

    TbRecommend selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") TbRecommend record, @Param("example") TbRecommendExample example);

    int updateByExample(@Param("record") TbRecommend record, @Param("example") TbRecommendExample example);

    int updateByPrimaryKeySelective(TbRecommend record);

    int updateByPrimaryKey(TbRecommend record);
}