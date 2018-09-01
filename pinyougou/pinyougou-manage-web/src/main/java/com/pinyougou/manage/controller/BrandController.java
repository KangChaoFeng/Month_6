package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName：BrandController
 * @Description：
 * @Author：CF_Kang
 * @E-mail：13755140412@163.com
 * @Date 2018年08月29日 19时53分
 * @Version V1.0
 */
@RequestMapping("/brand")
@RestController
public class BrandController {
    //    注入数据
    @Reference
    private BrandService brandService;
    //查询品牌
    @GetMapping("/findAll")
    public List<TbBrand>findAll(){
//        return brandService.queryAll();
        return brandService.findAll();
    }
    //    分页查询品牌
    @GetMapping("/testPage")
    public List<TbBrand>testPage(Integer page,Integer rows){
//        return brandService.testPage(page,rows);
        return (List<TbBrand>) brandService.findPage(page, rows).getRows();
    }
}
