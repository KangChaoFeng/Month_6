package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import com.pinyougou.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName：BrandServiceImpl
 * @Description：业务层接口实习类
 * @Author：CF_Kang
 * @E-mail：13755140412@163.com
 * @Date 2018年08月29日 19时47分
 * @Version V1.0
 */
@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl extends BaseServiceImpl<TbBrand> implements BrandService {
//    注入数据
    @Autowired
    private BrandMapper brandMapper;
//    查询品牌方法
    @Override
    public List<TbBrand> queryAll() {
        return brandMapper.queryAll();
    }
//分页查询品牌
    @Override
    public List<TbBrand> testPage(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        return brandMapper.selectAll();
    }
}
