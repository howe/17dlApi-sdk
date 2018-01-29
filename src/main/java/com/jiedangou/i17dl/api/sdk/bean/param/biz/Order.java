package com.jiedangou.i17dl.api.sdk.bean.param.biz;

import java.util.List;

/**
 * Created on 2018/1/28
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Order {

    /**
     * 订单号
     */
    private String order_id;

    /**
     * 订单标题
     */
    private String title;

    /**
     * 发单者ID
     */
    private Integer uid;

    /**
     * 接单者ID
     */
    private Integer receiver_id;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 订单价格
     */
    private Double price;

    /**
     * 打手需赔付的保证金
     */
    private Double part_deposit;

    /**
     * 代练需支付的代练费
     */
    private Double part_train_fee;

    /**
     * 安全保证金
     */
    private Double security_deposit;

    /**
     * 效率保证金
     */
    private Double efficiency_deposit;

    /**
     * 用户角色名
     */
    private String role_name;

    /**
     * 游戏名称
     */
    private String game;

    /**
     * 游戏账号
     */
    private String game_account;

    /**
     * 账号密码
     */
    private String game_password;

    /**
     * 游戏区名称
     */
    private String game_zone;

    /**
     * 游戏服名称
     */
    private String game_server;

    /**
     * 订单创建时间
     * unix时间戳
     */
    private Long create_time;

    /**
     * 订单完成时间
     * unix时间戳
     */
    private Long finish_time;

    /**
     * 订单要求完成时长
     * 单位 小时
     */
    private Integer requirement_time;

    /**
     * 接单时间
     * unix时间戳
     */
    private Long receiver_time;

    /**
     * 号主联系电话
     */
    private String tm_phone;

    /**
     * 订单说明
     */
    private String order_requirement;

    /**
     * 代练要求
     */
    private String content;

    /**
     * 订单状态说明
     * 中文
     */
    private String status_mean;

    /**
     * 订单状态描述
     * 英文
     */
    private String status_sec;

    /**
     * 取消者ID
     */
    private String cancel_uid;

    /**
     * 发单者昵称
     */
    private String uid_name;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(Integer receiver_id) {
        this.receiver_id = receiver_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPart_deposit() {
        return part_deposit;
    }

    public void setPart_deposit(Double part_deposit) {
        this.part_deposit = part_deposit;
    }

    public Double getPart_train_fee() {
        return part_train_fee;
    }

    public void setPart_train_fee(Double part_train_fee) {
        this.part_train_fee = part_train_fee;
    }

    public Double getSecurity_deposit() {
        return security_deposit;
    }

    public void setSecurity_deposit(Double security_deposit) {
        this.security_deposit = security_deposit;
    }

    public Double getEfficiency_deposit() {
        return efficiency_deposit;
    }

    public void setEfficiency_deposit(Double efficiency_deposit) {
        this.efficiency_deposit = efficiency_deposit;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getGame_account() {
        return game_account;
    }

    public void setGame_account(String game_account) {
        this.game_account = game_account;
    }

    public String getGame_password() {
        return game_password;
    }

    public void setGame_password(String game_password) {
        this.game_password = game_password;
    }

    public String getGame_zone() {
        return game_zone;
    }

    public void setGame_zone(String game_zone) {
        this.game_zone = game_zone;
    }

    public String getGame_server() {
        return game_server;
    }

    public void setGame_server(String game_server) {
        this.game_server = game_server;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Long getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(Long finish_time) {
        this.finish_time = finish_time;
    }

    public Integer getRequirement_time() {
        return requirement_time;
    }

    public void setRequirement_time(Integer requirement_time) {
        this.requirement_time = requirement_time;
    }

    public Long getReceiver_time() {
        return receiver_time;
    }

    public void setReceiver_time(Long receiver_time) {
        this.receiver_time = receiver_time;
    }

    public String getTm_phone() {
        return tm_phone;
    }

    public void setTm_phone(String tm_phone) {
        this.tm_phone = tm_phone;
    }

    public String getOrder_requirement() {
        return order_requirement;
    }

    public void setOrder_requirement(String order_requirement) {
        this.order_requirement = order_requirement;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus_mean() {
        return status_mean;
    }

    public void setStatus_mean(String status_mean) {
        this.status_mean = status_mean;
    }

    public String getStatus_sec() {
        return status_sec;
    }

    public void setStatus_sec(String status_sec) {
        this.status_sec = status_sec;
    }

    public String getCancel_uid() {
        return cancel_uid;
    }

    public void setCancel_uid(String cancel_uid) {
        this.cancel_uid = cancel_uid;
    }

    public String getUid_name() {
        return uid_name;
    }

    public void setUid_name(String uid_name) {
        this.uid_name = uid_name;
    }

    /**
     * 订单状态记录
     */
//    private List<> order_status_record
}
