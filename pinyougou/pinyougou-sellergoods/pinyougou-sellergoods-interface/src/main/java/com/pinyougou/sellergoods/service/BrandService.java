package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.service.BaseServcie;

import java.util.List;

/**
 * @ClassName：BrandService
 * @Description：service层接口类
 * @Author：CF_Kang
 * @E-mail：13755140412@163.com
 * @Date 2018年08月29日 19时43分
 * @Version V1.0
 */
public interface BrandService extends BaseServcie<TbBrand>{
//    查询品牌
    public List<TbBrand>queryAll();
//分页查询
    List<TbBrand> testPage(Integer page, Integer rows);
}
