package com.anonymous.orange.service.impl;

import com.anonymous.orange.entity.UserInfoPO;
import com.anonymous.orange.mapper.UserInfoMapper;
import com.anonymous.orange.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangyun
 * 2020-12-21 11:27
 */
@Service("userInfoService")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserInfoServiceImpl implements UserInfoService {

    private final UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfoPO> selectList() {
        return userInfoMapper.selectList(null);
    }
}
