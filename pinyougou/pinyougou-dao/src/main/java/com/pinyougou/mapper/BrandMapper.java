package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * @ClassName：BrandMapper
 * @Description：dao层方法接口
 * @Author：CF_Kang
 * @E-mail：13755140412@163.com
 * @Date 2018年08月29日 19时40分
 * @Version V1.0
 */
public interface BrandMapper {
//    查询品牌
    public List<TbBrand>queryAll();
}
