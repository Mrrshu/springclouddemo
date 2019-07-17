package com.suxiaowei.mysqlclient.dao;

import com.suxiaowei.mysqlclient.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;

/**

 * 标签的持久层接口
 */
public interface LabelDao extends JpaRepository<Label,String>{
}
