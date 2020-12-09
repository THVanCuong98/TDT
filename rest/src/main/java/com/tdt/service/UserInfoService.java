package com.tdt.service;

import com.tdt.entity.UserInfo;

public interface UserInfoService {

    UserInfo loadUserInfo(int id);
    UserInfo save(UserInfo userInfo);
    UserInfo delete(int id);
    UserInfo update(UserInfo userInfo);
}
