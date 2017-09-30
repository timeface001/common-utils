package com.fs.dreams.dto;

import java.util.List;

/**
 * @author fengsong
 * @description:一句话描述下类的功能
 * @time 2017-08-02 10:35
 **/
public class FPageResponse<T> {

    private List<T> dataList;

    private int pageNum;

    private int pageSize;

    private int totalPages;

    public FPageResponse(List<T> dataList, int pageNum, int pageSize, int totalPages) {
        this.dataList = dataList;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
    }

    public FPageResponse() {
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
