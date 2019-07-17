package com.suxiaowei.mysqlclient.service;

import com.suxiaowei.mysqlclient.dao.LabelDao;
import com.suxiaowei.mysqlclient.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.suxiaowei.mysqlclient.util.IdWorker;

import java.util.List;

/**
 * @author suxiaowei
 * @Company
 * 标签的业务类
 */
@Service
public class LabelService {

    @Autowired
    private LabelDao labelDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 查询所有标签
     * @return
     */
    public List<Label> findAll(){
        return labelDao.findAll();
    }

    /**
     * 根据id查询一个标签
     * @param id
     * @return
     */
    public Label findById(String id){
        return labelDao.findById(id).get();
    }

    /**
     * 保存
     * @param label
     */
    public void add(Label label){
        label.setId(String.valueOf(idWorker.nextId()));
        labelDao.save(label);
    }

    /**
     * 更新
     * @param label
     */
    public void update(Label label){
        labelDao.save(label);
    }

    /**
     * 根据id删除
     * @param id
     */
    public void delete(String id){
        labelDao.deleteById(id);
    }
}
