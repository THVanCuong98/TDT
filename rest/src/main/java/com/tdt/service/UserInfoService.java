package com.tdt.service;

import com.tdt.entity.UserInfo;

import java.util.List;

public interface UserInfoService {

    UserInfo loadUserInfo(int id);
    List<UserInfo> findAll();
    UserInfo save(UserInfo userInfo);
    UserInfo delete(int id);
    UserInfo update(UserInfo userInfo);
}
