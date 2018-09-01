package com.pinyougou.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
//映射数据库中对应的表的名称
@Table(name = "tb_brand")
public class TbBrand implements Serializable {
//id注解表示该属性在数据库表中是一个主键字段
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键生成策略
    private Long id;

    private String name;

    private String firstChar;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }
}