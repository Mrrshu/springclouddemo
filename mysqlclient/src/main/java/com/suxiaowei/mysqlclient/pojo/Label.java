package com.suxiaowei.mysqlclient.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author suxiaowei
 * @Company http://www.ithiema.com
 * 标签的实体类
 */
@Entity
@Table(name="tb_label")
public class Label implements Serializable{

    @Id
    private String id;
    private String labelname;
    private String state;
    private Long count;
    private String recommend;
    private Long fans;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabelname() {
        return labelname;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public Long getFans() {
        return fans;
    }

    public void setFans(Long fans) {
        this.fans = fans;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id='" + id + '\'' +
                ", labelname='" + labelname + '\'' +
                ", state='" + state + '\'' +
                ", count=" + count +
                ", recommend='" + recommend + '\'' +
                ", fans=" + fans +
                '}';
    }
}
