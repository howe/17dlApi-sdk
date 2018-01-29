package com.jiedangou.i17dl.api.sdk.bean.param.req.ordershall;

import com.jiedangou.i17dl.api.sdk.bean.param.req.BaseReq;

/**
 * Openapi - 接单大厅-列表
 * Created on 2018/1/20
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class IndexReq extends BaseReq {

    /**
     * 最低价格
     */
    private Double minPrice;

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    /**
     * 最高价格
     */
    private Double maxPrice;

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
     * price(价格),requirement_time(代练时间),deposit(保证金)
     */
    private String orderByKey;

    public String getOrderByKey() {
        return orderByKey;
    }

    public void setOrderByKey(String orderByKey) {
        this.orderByKey = orderByKey;
    }

    /**
     * 3(降序)，4(升序)
     */
    private Integer orderByValue;

    public Integer getOrderByValue() {
        return orderByValue;
    }

    public void setOrderByValue(Integer orderByValue) {
        this.orderByValue = orderByValue;
    }

    /**
     * 搜索关键字
     */
    private String keyWord;

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    /**
     * 游戏id
     */
    private String game;

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    /**
     * 游戏区id
     */
    private String gameZone;

    public String getGameZone() {
        return gameZone;
    }

    public void setGameZone(String gameZone) {
        this.gameZone = gameZone;
    }

    /**
     * 游戏服id
     */
    private String gameServer;

    public String getGameServer() {
        return gameServer;
    }

    public void setGameServer(String gameServer) {
        this.gameServer = gameServer;
    }

    /**
     * 第几页
     */
    private Integer page;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 每页大小
     */
    private Integer pageSize;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
