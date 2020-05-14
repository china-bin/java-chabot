package com.springboot.fast.model.qo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author java-chatbot
 * @since 2020-03-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AdminQO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 登陆密码
     */
    private String loginPassword;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 头像地址
     */
    private String headUrl;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 密钥
     */
    private String securityKey;

    /**
     * 登陆次数
     */
    private Integer loginTimes;

    /**
     * 失败登陆次数
     */
    private Integer loginErrorTimes;

    /**
     * 最后登陆时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private LocalDateTime lastLoginTime;

    /**
     * 最后登陆ip
     */
    private String lastLoginIp;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 1为超级管理员0为非超级管理员
     */
    private String isSuper;

    /**
     * 0已删除，1未删除，默认1
     */
    private String isDelete;

    /**
     * 状态(1:正常，0:禁用)
     */
    private Integer statusId;

    private String roles;

    /**
     * 未勾选的角色
     */
    private String notRoles;


}
