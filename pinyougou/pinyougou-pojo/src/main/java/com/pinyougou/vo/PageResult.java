package com.pinyougou.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName：PageResult
 * @Description：
 * @Author：CF_Kang
 * @E-mail：13755140412@163.com
 * @Date 2018年08月30日 16时13分
 * @Version V1.0
 */

/**
 * 因为以后需要将该对象网络传递，所以必须实现序列化接口
 * 序列化：将一个java对象转换为一个特有格式的字符串
 * 反序列化：将一个特定格式的字符串转换成一个java对象（自定义队想，Map。。。）
 */

public class PageResult implements Serializable {
    private long total;//总记录数
    private List<?>rows;//记录列表

    public PageResult(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
