package com.springcloud.study.common.core.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 分页信息
 *
 * @author wangtongzhou
 * @since 2020-05-31 10:23
 */
public class PageResponse<T> implements Serializable {

    /**
     * 数据
     */
    private List<T> list;

    /**
     * 总量
     */
    private Long total;

    public List<T> getList() {
        return list;
    }

    public PageResponse<T> setList(List<T> list) {
        this.list = list;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public PageResponse<T> setTotal(Long total) {
        this.total = total;
        return this;
    }
}
