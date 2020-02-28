package com.bw.xuliming20200224.entity;

import java.util.List;

/**
 * 时间：2020/2/24
 * 作者：徐黎明
 * 类的作用：
 */
public class ShopEntity {

    /**
     * result : []
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<?> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<?> getResult() {
        return result;
    }

    public void setResult(List<?> result) {
        this.result = result;
    }
}
