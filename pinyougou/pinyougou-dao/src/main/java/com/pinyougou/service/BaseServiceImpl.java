package com.pinyougou.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinyougou.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName：BaseServiceImpl
 * @Description：
 * @Author：CF_Kang
 * @E-mail：13755140412@163.com
 * @Date：2018年08月30日 16时21分
 * @Version：V1.0
 */
public abstract class BaseServiceImpl<T> implements BaseServcie<T> {
    //4.1之后版本的spring可以使用泛型依赖注入
//    Mapper<TbBrand> mapper--->brandMapper
    @Autowired
    private Mapper<T>mapper;

    @Override
    public T findOne(Serializable id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> findAll() {
        return mapper.selectAll();
    }

    @Override
    public List<T> findByWhere(T t) {
        return mapper.select(t);
    }

    @Override
    public PageResult findPage(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        List<T>list=mapper.selectAll();
        PageInfo<T>pageInfo=new PageInfo<>(list);
        return new PageResult(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public PageResult findPage(Integer page, Integer rows, T t) {
        PageHelper.startPage(page,rows);
        List<T>list=mapper.select(t);
        PageInfo<T>pageInfo=new PageInfo<>(list);
        return new PageResult(pageInfo.getTotal(), pageInfo.getList());
    }

    @Override
    public void add(T t) {
//        选择性新增
        mapper.insertSelective(t);
    }

    @Override
    public void update(T t) {
//        选择性更新
        mapper.updateByPrimaryKeySelective(t);
    }

    @Override
    public void deleteById(Serializable[] ids) {
        if (ids!=null&&ids.length>0){
            for (Serializable id:ids){
                mapper.deleteByPrimaryKey(id);
            }
        }
    }
}
