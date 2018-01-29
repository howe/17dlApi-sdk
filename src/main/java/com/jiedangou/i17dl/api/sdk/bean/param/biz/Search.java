package com.jiedangou.i17dl.api.sdk.bean.param.biz;

/**
 * Created on 2018/1/20
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Search {

    private String orderByKey;

    private Integer orderByValue;

    private String game;

    private String gameZone;

    private String gameServer;

    private Double minPrice;

    private Double maxPrice;

    private Integer page;

    private Integer pageSize;

    private String keyWord;

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrderByKey() {
        return orderByKey;
    }

    public void setOrderByKey(String orderByKey) {
        this.orderByKey = orderByKey;
    }

    public Integer getOrderByValue() {
        return orderByValue;
    }

    public void setOrderByValue(Integer orderByValue) {
        this.orderByValue = orderByValue;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getGameZone() {
        return gameZone;
    }

    public void setGameZone(String gameZone) {
        this.gameZone = gameZone;
    }

    public String getGameServer() {
        return gameServer;
    }

    public void setGameServer(String gameServer) {
        this.gameServer = gameServer;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
}
