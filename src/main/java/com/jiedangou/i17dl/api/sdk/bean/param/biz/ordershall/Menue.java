package com.jiedangou.i17dl.api.sdk.bean.param.biz.ordershall;

import com.jiedangou.i17dl.api.sdk.bean.param.biz.Banner;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Orderby;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Pricerange;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Sub;

import java.util.List;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Menue {

    private List<Banner> banner;

    public List<Banner> getBanner() {
        return banner;
    }

    public void setBanner(List<Banner> banner) {
        this.banner = banner;
    }

    private List<Sub> game;

    public List<Sub> getGame() {
        return game;
    }

    public void setGame(List<Sub> game) {
        this.game = game;
    }

    private List<Orderby> orderBys;

    public List<Orderby> getOrderBys() {
        return orderBys;
    }

    public void setOrderBys(List<Orderby> orderBys) {
        this.orderBys = orderBys;
    }

    private List<Pricerange> priceRange;

    public List<Pricerange> getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(List<Pricerange> priceRange) {
        this.priceRange = priceRange;
    }
}
