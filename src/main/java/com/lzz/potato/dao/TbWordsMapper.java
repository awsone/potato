package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbWords;
import com.lzz.potato.pojo.TbWordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbWordsMapper {
    int countByExample(TbWordsExample example);

    int deleteByExample(TbWordsExample example);

    int deleteByPrimaryKey(Integer wsId);

    int insert(TbWords record);

    int insertSelective(TbWords record);

    List<TbWords> selectByExample(TbWordsExample example);

    TbWords selectByPrimaryKey(Integer wsId);

    int updateByExampleSelective(@Param("record") TbWords record, @Param("example") TbWordsExample example);

    int updateByExample(@Param("record") TbWords record, @Param("example") TbWordsExample example);

    int updateByPrimaryKeySelective(TbWords record);

    int updateByPrimaryKey(TbWords record);
}