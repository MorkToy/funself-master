package com.onelife.fun.dao;

import com.onelife.fun.entity.Wish;
import com.onelife.fun.entity.WishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WishMapper {
    int countByExample(WishExample example);

    int deleteByPrimaryKey(Integer wishId);

    int insert(Wish record);

    int insertSelective(Wish record);

    List<Wish> selectByExample(WishExample example);

    Wish selectByPrimaryKey(Integer wishId);

    int updateByExampleSelective(@Param("record") Wish record, @Param("example") WishExample example);

    int updateByExample(@Param("record") Wish record, @Param("example") WishExample example);

    int updateByPrimaryKeySelective(Wish record);

    int updateByPrimaryKey(Wish record);
}