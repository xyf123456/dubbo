package com.ht.api.service;/**
 * Created by Administrator on 2019/1/13.
 */


import com.ht.utils.response.BaseResponse;

/**
 * ClassName: {@link IDubboItemService}
 * create by:  xyf
 * description:  订单接口
 * create time: 2019/12/11 22:28
 */
public interface IDubboItemService {

    BaseResponse listItems();

    BaseResponse listPageItems(Integer pageNo, Integer pageSize);

    BaseResponse listPageItemsParams(Integer pageNo, Integer pageSize, String search);

}
