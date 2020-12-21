package com.anonymous.orange.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author wangyun
 * 2020-12-21 11:12
 */
@Data
@TableName("user_info")
public class UserInfoPO {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "user_name")
    private String userName;

    @TableField(value = "mobile_phone")
    private String mobilePhone;

    @TableField(value = "address")
    private String address;

    @TableField(value = "photo")
    private String photo;

    @TableField(value = "age")
    private Integer age;
}
