package com.ht.model.dao;

import com.ht.model.pojo.ItemInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemInfo record);

    int insertSelective(ItemInfo record);

    ItemInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemInfo record);

    int updateByPrimaryKey(ItemInfo record);

    /**
     * Description: 查询所有的商品的信息（有效同时按创建时间降序）
     * param: []
     * return: java.util.List<com.debug.mooc.dubbo.one.model.entity.ItemInfo>
     * Date: 2019/8/3 13:04
     */
    List<ItemInfo> selectAll();

    List<ItemInfo> selectAllByParams(@Param("search") String search);
}














