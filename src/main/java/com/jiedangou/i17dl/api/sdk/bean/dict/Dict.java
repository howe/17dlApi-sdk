package com.jiedangou.i17dl.api.sdk.bean.dict;

/**
 * Created on 2017/11/25
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class Dict {

    // 价格
    public static final String _17DL_ORDERBYKEY_PRICE = "price";

    // 代练时间
    public static final String _17DL_ORDERBYKEY_REQUIREMENTTIME = "requirement_time";

    // 保证金
    public static final String _17DL_ORDERBYKEY_DEPOSIT = "deposit";

    // 降序
    public static final Integer _17DL_ORDERBYVALUE_DESC = 3;

    // 升序
    public static final Integer _17DL_ORDERBYVALUE_ASC = 4;

    public static final String DATE_FORMART_FULL = "yyyy-MM-dd hh:mm:ss";

    public static final String _17DL_DEV_API_URL = "http://115.238.99.70:8082";
    public static final String _17DL_TEST_API_URL = "https://twww.17dl.com";
    public static final String _17DL_PRE_API_URL = "https://prewww.17dl.com";
    public static final String _17DL_API_URL = "https://www.17dl.com";

    /*****************返回错误码********************/
    public static final Integer _17DL_ERROR_CODE_PARAMS_ERROR = 0; //参数错误，请求失败

    public static final Integer _17DL_ERROR_CODE_NO_ERROR = 1; //请求成功

    public static final Integer _17DL_ERROR_CODE_UNLOGIN = 2; //用户未登陆

    public static final Integer _17DL_ERROR_CODE_REQUEST_FAIL = 3; //请求失败

    public static final Integer _17DL_ERROR_CODE_REQUEST_CERTIFIED = 4; //未实名认证

    public static final Integer _17DL_ERROR_CODE_INTERFACE_REFUSE = 5;  //接口不可访问，渠道错误

    public static final Integer _17DL_ERROR_CODE_INTERFACE_VERIFY_FAILURE = 6;  //接口不可访问，验证失败

    public static final Integer _17DL_ERROR_CODE_DECRYPT_FAILURE = 7;  //解密失败


    /*****************搜索历史********************/
    public static final Integer _17DL_ERROR_CODE_INSEARCH_SEARCH_HISTORY_FAIL = 11; //搜索历史插入失败

    public static final Integer _17DL_ERROR_CODE_UPDATE_SEARCH_HISTORY_FAIL = 12; //搜索历史更新失败

    public static final Integer _17DL_ERROR_CODE_SEARCH_HISTORY_UNEXIST = 13; //搜索历史不存在

    public static final Integer _17DL_ERROR_CODE_DELETE_SEARCH_HISTORY_SUCCESS = 14; //搜索历史删除成功

    public static final Integer _17DL_ERROR_CODE_DELETE_SEARCH_HISTORY_FAIL = 15; //搜索历史删除失败


    /*****************用户登录********************/
    public static final Integer _17DL_ERROR_CODE_MEMBER_LOGIN_ERROR = 31; //用户不存在

    public static final Integer _17DL_ERROR_CODE_MEMBER_FREEZE = 32; //用户被冻结

    public static final Integer _17DL_ERROR_CODE_MEMBER_UNABLE_LOGIN = 33; //资金账户不可登录

    public static final Integer _17DL_ERROR_CODE_MEMBER_SUB_LOGIN_ERROR = 34; //子账户不可登录

    public static final Integer _17DL_ERROR_CODE_MEMBER_NO_ANCHOR = 35; //非鱼侠不可登录

    public static final Integer _17DL_ERROR_CODE_MEMBER_CODE_ERROR = 36; //验证码错误

    public static final Integer _17DL_ERROR_CODE_MEMBER_MODIFY_PASSWORD_ERROR = 37; //密码修改失败

    public static final Integer _17DL_ERROR_CODE_MEMBER_NICKNAME_EXISTS = 38; //昵称已存在

    public static final Integer _17DL_ERROR_CODE_MEMBER_LOGIN_FAILURE = 39; //登录失败

    /*****************支付密码管理********************/
    public static final Integer _17DL_ERROR_CODE_PAY_PASSWORD_EXISTS = 40;  //支付密码已存在

    public static final Integer _17DL_ERROR_CODE_PAY_PASSWORD_SET_FAILURE = 41;  //支付密码设置\修改失败

    public static final Integer _17DL_ERROR_CODE_PAY_PASSWORD_EMPTY = 42;   //支付密码为空

    public static final Integer _17DL_ERROR_CODE_PAY_PASSWORD_ERROR = 43;  //支付密码错误

    public static final Integer _17DL_ERROR_CODE_PAY_PASSWORD_REAL_NAME_ERROR = 44;  //姓名不正确

    public static final Integer _17DL_ERROR_CODE_PAY_PASSWORD_ID_CARD_ERROR = 45;  //身份证号码不正确


    /*****************绑定手机号********************/
    public static final Integer _17DL_ERROR_CODE_MOBILE_BANDING = 51;  //手机已被绑定，不可重复绑定

    public static final Integer _17DL_ERROR_CODE_MOBILE_BAND_FAILURE = 59;  //手机绑定失败


    /*****************用户提现********************/
    public static final Integer _17DL_ERROR_CODE_WITHDRAW_TYPE_ERROR = 61;  //提现方式不正确

    public static final Integer _17DL_ERROR_CODE_WITHDRAW_BANK_ERROR = 62;  //银行卡存在问题

    public static final Integer _17DL_ERROR_CODE_WITHDRAW_CHECK_FAILURE = 63;   //用户提现验证失败

    public static final Integer _17DL_ERROR_CODE_WITHDRAW_FAILURE = 69;   //用户提现失败

    /*****************消息********************/
    public static final Integer _17DL_ERROR_CODE_MESSAGE_UPDATE_FAIL = 71;   //未读消息更新失败

    public static final Integer _17DL_ERROR_CODE_MESSAGE_UNEXIST = 72;   //消息不存在

    /*****************用户反馈********************/
    public static final Integer _17DL_ERROR_CODE_FEEDBACK_CONTENT_EMPTY = 81;   //反馈内容不可为空

    public static final Integer _17DL_ERROR_CODE_FEEDBACK_FAILURE = 82;   //反馈失败

    /*****************充值接口********************/
    public static final Integer _17DL_ERROR_CODE_CHARGE_ORDER_EMPTY = 91;   //订单号不可为空

    public static final Integer _17DL_ERROR_CODE_CHARGE_CHANNEL_EMPTY = 92;   //渠道号不可为空

    public static final Integer _17DL_ERROR_CODE_CHARGE_AMOUNT_EMPTY = 93;   //人名币单位不可为空

    public static final Integer _17DL_ERROR_CODE_CHARGE_SUBJECT_EMPTY = 94;   //商品标题不可为空

    public static final Integer _17DL_ERROR_CODE_CHARGE_CHANNEL_NOT_EXISTS = 95;   //支付渠道不支持

    public static final Integer _17DL_ERROR_CODE_CHARGE_WX_OPENID_NOT_EXISTS = 96;   //微信支付openid不存在

    public static final Integer _17DL_ERROR_CODE_CHARGE_FAILURE = 99;   //充值失败

    /*****************订单********************/
    public static final Integer _17DL_ERROR_CODE_ORDER_UNEXIST = 101; //订单不存在

    public static final Integer _17DL_ERROR_CODE_ORDER_IS_TAKED = 102; //订单已被接

    public static final Integer _17DL_ERROR_CODE_ORDER_NOT_YOURS = 103; //订单不属于你

    public static final Integer _17DL_ERROR_CODE_ORDER_DELETE = 104; //订单一被删除

    public static final Integer _17DL_ERROR_CODE_ORDER_NOT_TAKE_YOURS = 105; //不能接自己发的单

    public static final Integer _17DL_ERROR_CODE_ORDER_IS_HANDLE = 106; //订单处理中

    public static final Integer _17DL_ERROR_CODE_ORDER_PAY_PASS_ERROR = 107; //支付密码错误

    public static final Integer _17DL_ERROR_CODE_ORDER_IN_BLACKLIST = 108; //在黑名单中

    public static final Integer _17DL_ERROR_CODE_ORDER_RECEIVE_FAIL = 109; //接单失败

    public static final Integer _17DL_ERROR_CODE_MONEY_NOT_ENOUGH = 110; //余额不足

    public static final Integer _17DL_ERROR_CODE_MONEY_LESS_THAN_USE = 111; //可操作资金少于当前金额

    public static final Integer _17DL_ERROR_CODE_BILLER_MONEY_NOT_ENOUGH = 112; //发单人余额不足

    public static final Integer _17DL_ERROR_CODE_ORDER_PART_DEPOSIT_ERROR = 113; //部分保证金不能大于已付保证金

    public static final Integer _17DL_ERROR_CODE_ORDER_PART_TRAIN_FEE_ERROR = 114; //部分价格不能大于支付价格

    public static final Integer _17DL_ERROR_CODE_ORDER_CAN_NOT_OPERATE = 115; //不能操作订单

    public static final Integer _17DL_ERROR_CODE_ORDER_REVOKE_FAIL = 116; //撤销该订单失败

    public static final Integer _17DL_ERROR_CODE_ORDER_CANCEL_REVOKE_FAIL = 117; //取消申请撤销失败

    public static final Integer _17DL_ERROR_CODE_ORDER_AGREE_REVOKE_FAIL = 118; //同意申请撤销失败

    public static final Integer _17DL_ERROR_CODE_ORDER_ALREADY_COMPLETE = 119; //订单已完成不能再操作

    public static final Integer _17DL_ERROR_CODE_ORDER_UPLOAD_PIC_FALSE = 120; //截图上传失败

    public static final Integer _17DL_ERROR_CODE_ORDER_EXCEPTION_FAIL = 121; //提交异常失败

    public static final Integer _17DL_ERROR_CODE_ORDER_NO_PERMISSION = 122; //没有订单操作的权限

    public static final Integer _17DL_ERROR_CODE_ORDER_CANCEL_EXCEPTION_FAIL = 123; //取消异常失败

    public static final Integer _17DL_ERROR_CODE_ORDER_APPLY_ARBITRATE_FAIL = 124; //申请仲裁失败

    public static final Integer _17DL_ERROR_CODE_ORDER_CANCEL_ARBITRATE_FAIL = 125; //取消申请仲裁失败

    public static final Integer _17DL_ERROR_CODE_ORDER_BEGIN_FAIL = 126; //开始打单失败

    public static final Integer _17DL_ERROR_CODE_ORDER_APPLY_ACCEPTED_FAIL = 127; //申请验收失败

    public static final Integer _17DL_ERROR_CODE_ORDER_CANCEL_ACCEPTED_FAIL = 128; //取消申请验收失败

    public static final Integer _17DL_ERROR_CODE_ORDER_NO_ON_GAME_PIC = 129; //没有上号截图

    public static final Integer _17DL_ERROR_CODE_ORDER_UPLOAD_EXPLOITS_FAIL = 130; //上传战绩失败

    public static final Integer _17DL_ERROR_CODE_ORDER_LEAVE_MESSAGE_FAIL = 131; //留言失败

    public static final Integer _17DL_ERROR_CODE_ORDER_NO_UNDER_GAME_PIC = 132; //没有下号截图

    public static final Integer _17DL_ERROR_CODE_ORDER_LOCK_ACCOUNT_FAIL = 133; //锁定账号失败

    public static final Integer _17DL_ERROR_CODE_ORDER_CANCEL_LOCK_ACCOUNT_FAIL = 134; //取消锁定账号失败

    public static final Integer _17DL_ERROR_CODE_ORDER_ACCEPT_COMPLETE_FAIL = 135; //商家验收失败

    public static final Integer _17DL_ERROR_CODE_ORDER_DELETE_FAIL = 136; //订单删除失败

    public static final Integer _17DL_ERROR_CODE_ORDER_UPDATE_PWD_FAIL = 137; //密码修改失败

    public static final Integer _17DL_ERROR_CODE_ORDER_UPDATE_FAIL = 138; //订单修改失败

    public static final Integer _17DL_ERROR_CODE_ORDER_ACTIVITY_FAILURE = 139; //订单活动领取失败

    public static final Integer _17DL_ERROR_CODE_ORDER_STS_FAIL = 140; //获取临时凭证失败

    public static final Integer _17DL_ERROR_CODE_ORDER_ARBITRATE_TIME_FAILURE = 141; //申请仲裁需要在申请撤销2小时之后

    public static final Integer _17DL_ERROR_CODE_ORDER_OFF_SHELF_FAILURE = 142; //下架失败

    /*****************视频********************/
    public static final Integer _17DL_ERROR_CODE_ROOM_ERROR = 200; //房间有问题

    public static final Integer _17DL_ERROR_CODE_ORDER_VIDEO_UPLOAD_FAIL = 201; //视频上传失败

    /*****************完善用户信息********************/
    public static final Integer _17DL_ERROR_CODE_USER_AVATAR_EMPTY = 301;   //头像不可为空

    public static final Integer _17DL_ERROR_CODE_USER_NICKNAME_EMPTY = 302;   //昵称不可为空

    public static final Integer _17DL_ERROR_CODE_USER_NICKNAME_LENGTH = 303;   //昵称长度必须在2-10为之间

    public static final Integer _17DL_ERROR_CODE_USER_UPDATE_FAILURE = 304;   //更新失败

    /*****************完善用户信息********************/
    public static final Integer _17DL_ERROR_CODE_MESSAGE_DELETE_FAIL = 401;   //删除失败
}
