package com.anonymous.orange.service;

import com.anonymous.orange.entity.UserInfoPO;

import java.util.List;

/**
 * @author wangyun
 * 2020-12-21 11:27
 */
public interface UserInfoService {

    /**
     * 列表查询
     * @return list
     */
    List<UserInfoPO> selectList();

}
