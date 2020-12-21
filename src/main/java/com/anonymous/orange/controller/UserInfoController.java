package com.anonymous.orange.controller;

import com.alibaba.fastjson.JSON;
import com.anonymous.orange.entity.UserInfoPO;
import com.anonymous.orange.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangyun
 * 2020-12-21 11:28
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserInfoController {

    private final UserInfoService userInfoService;

    @GetMapping(value = "/orange/user/list")
    public String selectList(){
        List<UserInfoPO> userInfos = userInfoService.selectList();
        return JSON.toJSONString(userInfos);
    }

}
