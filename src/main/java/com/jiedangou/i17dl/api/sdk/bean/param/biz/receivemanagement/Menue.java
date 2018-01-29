package com.jiedangou.i17dl.api.sdk.bean.param.biz.receivemanagement;

import com.jiedangou.i17dl.api.sdk.bean.param.biz.Game;
import com.jiedangou.i17dl.api.sdk.bean.param.biz.Orderstatus;

import java.util.List;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Menue {

    private List<Orderstatus> order_status;

    public List<Orderstatus> getOrder_status() {
        return order_status;
    }

    public void setOrder_status(List<Orderstatus> order_status) {
        this.order_status = order_status;
    }

    private List<Game> game;

    public List<Game> getGame() {
        return game;
    }

    public void setGame(List<Game> game) {
        this.game = game;
    }
}
