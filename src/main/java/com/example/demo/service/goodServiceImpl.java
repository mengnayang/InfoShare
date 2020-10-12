package com.example.demo.service;

import com.example.demo.dao.goodMapper;
import com.example.demo.entity.good;
import com.example.demo.interfaces.goodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务层
 */
@Service
public class goodServiceImpl implements goodService {
    @Autowired
    private goodMapper goodMapper1;

    /**
     * 获取所有商品信息
     * @return
     */
    @Override
    public List<good> allGood() {
        return goodMapper1.selectAll();
    }

    /**
     * 获取指定商品信息
     * @param id
     * @return
     */
    @Override
    public good getGoodById(String id) {
        good good = new good();
        good.setGood_id(id);
        return goodMapper1.selectByPrimaryKey(good);
    }

    /**
     * 添加商品
     * @param good
     * @return
     */
    @Override
    public Integer addGood(good good) {
        return goodMapper1.insert(good);
    }

    /**
     * 修改商品
     * @param good
     * @return
     */
    @Override
    public Integer editGood(good good) {
        return goodMapper1.updateByPrimaryKey(good);
    }

    /**
     * 删除指定商品信息
     * @param id
     * @return
     */
    @Override
    public Integer deleteGoodById(String id) {
        good good = new good();
        good.setGood_id(id);
        return goodMapper1.deleteByPrimaryKey(good);
    }
}
