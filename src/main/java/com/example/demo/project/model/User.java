package com.example.demo.project.model;

import com.example.demo.project.base.model.BaseModel;
import lombok.Data;

import java.util.Date;

@Data
public class User extends BaseModel {
    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别 0男1女
     */
    private Integer sex;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 签名
     */
    private String signature;

    /**
     * 手机号
     */
    private String phoneNum;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 省
     */
    private Long province;

    /**
     * 市
     */
    private Long city;

    /**
     * 区
     */
    private Long country;

    /**
     * 微信
     */
    private String wechat;

    /**
     * QQ
     */
    private String qq;

    /**
     * 微博
     */
    private String weibo;

    /**
     * 状态 0正常1异常
     */
    private Integer status;


}
