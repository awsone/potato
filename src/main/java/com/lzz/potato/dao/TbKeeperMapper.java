package com.lzz.potato.dao;

import com.lzz.potato.pojo.TbKeeper;
import com.lzz.potato.pojo.TbKeeperExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbKeeperMapper {
    int countByExample(TbKeeperExample example);

    int deleteByExample(TbKeeperExample example);

    int deleteByPrimaryKey(Integer kId);

    int insert(TbKeeper record);

    int insertSelective(TbKeeper record);

    List<TbKeeper> selectByExample(TbKeeperExample example);

    TbKeeper selectByPrimaryKey(Integer kId);

    int updateByExampleSelective(@Param("record") TbKeeper record, @Param("example") TbKeeperExample example);

    int updateByExample(@Param("record") TbKeeper record, @Param("example") TbKeeperExample example);

    int updateByPrimaryKeySelective(TbKeeper record);

    int updateByPrimaryKey(TbKeeper record);
}