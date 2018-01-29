package com.jiedangou.i17dl.api.sdk.bean.param.biz;

/**
 * Created on 2018/1/21
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Baseorder {

    /**
     * MongodbId
     */
    private String _id;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * 17DL订单ID
     */
    private String order_id;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    /**
     * 订单状态
     */
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 订单价格
     */
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 订单标题
     */
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 订单创建时间
     * Unix时间戳
     */
    private Long create_time;

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    /**
     * 游戏名称
     */
    private String game;

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    /**
     * 游戏区
     */
    private String game_zone;

    public String getGame_zone() {
        return game_zone;
    }

    public void setGame_zone(String game_zone) {
        this.game_zone = game_zone;
    }

    /**
     * 游戏服
     */
    private String game_server;

    public String getGame_server() {
        return game_server;
    }

    public void setGame_server(String game_server) {
        this.game_server = game_server;
    }

    /**
     * 发单者用户ID
     */
    private Integer uid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 发单者名称
     */
    private String uid_name;

    public String getUid_name() {
        return uid_name;
    }

    public void setUid_name(String uid_name) {
        this.uid_name = uid_name;
    }

    /**
     * 安全保证金
     */
    private Double security_deposit;

    public Double getSecurity_deposit() {
        return security_deposit;
    }

    public void setSecurity_deposit(Double security_deposit) {
        this.security_deposit = security_deposit;
    }

    /**
     * 效率保证金
     */
    private Double efficiency_deposit;

    public Double getEfficiency_deposit() {
        return efficiency_deposit;
    }

    public void setEfficiency_deposit(Double efficiency_deposit) {
        this.efficiency_deposit = efficiency_deposit;
    }

    /**
     * 代练总时长
     */
    private Integer requirement_time;

    public Integer getRequirement_time() {
        return requirement_time;
    }

    public void setRequirement_time(Integer requirement_time) {
        this.requirement_time = requirement_time;
    }

    /**
     * 订单说明
     */
    private String order_requirement;

    public String getOrder_requirement() {
        return order_requirement;
    }

    public void setOrder_requirement(String order_requirement) {
        this.order_requirement = order_requirement;
    }

    /**
     * 代练要求
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 订单状态说明
     * 中文
     */
    private String status_mean;

    public String getStatus_mean() {
        return status_mean;
    }

    public void setStatus_mean(String status_mean) {
        this.status_mean = status_mean;
    }

    /**
     * 订单状态描述
     * 英文
     */
    private String status_sec;

    public String getStatus_sec() {
        return status_sec;
    }

    public void setStatus_sec(String status_sec) {
        this.status_sec = status_sec;
    }

    /**
     * 私有代练编号
     */
    private String private_beater;

    public String getPrivate_beater() {
        return private_beater;
    }

    public void setPrivate_beater(String private_beater) {
        this.private_beater = private_beater;
    }

    /**
     * 总保证金
     * 效率保证金 + 安全保证金
     */
    private Double deposit;

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    /**
     * 代练类型
     * 0 排位，
     * 1 等级，
     * 2 匹配，
     * 3 陪练，
     * 4 晋级，
     * 5 级别，
     * 6 其他
     */
    private Integer leveling_type;

    public Integer getLeveling_type() {
        return leveling_type;
    }

    public void setLeveling_type(Integer leveling_type) {
        this.leveling_type = leveling_type;
    }
}
