package com.bcfou.common.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * vip解析链接
 * @Author: 编程否
 * @Date: 2018/9/12 20:51
 */
@Entity
@Table(name = "t_vip")
@Data
public class VipCrackUrl implements Serializable {
    private static final long serialVersionUID = -1212690147710685070L;
    @Id
    @GeneratedValue
    /** 主键 */
    private Integer id;
    /** 网址接口 */
    private String url;
}
