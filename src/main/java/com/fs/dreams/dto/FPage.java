package com.fs.dreams.dto;/**
 * Created by fengsong on 2017/8/11.
 */

import java.util.Objects;

/**
 * @author fengsong
 * @description:一句话描述下类的功能
 * @time 2017-08-11 15:39
 **/
public class FPage {
    protected Integer pageSize;
    protected Integer pageNum;

    public Integer getPageSize() {
        return Objects.isNull(pageSize) ? 10 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return Objects.isNull(pageNum) ? 1 : pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
