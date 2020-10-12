package com.example.demo.interfaces;

import com.example.demo.entity.good;

import java.util.List;

/**
 * 服务实现接口层
 */
public interface goodService {
    //获取所有商品信息
    List<good> allGood();

    //获取指定商品信息
    good getGoodById(String id);

    //添加商品
    Integer addGood(good good);

    //修改商品
    Integer editGood(good good);

    //删除指定商品
    Integer deleteGoodById(String id);
}
