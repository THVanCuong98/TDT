package com.tdt.service.impl;

import com.tdt.dao.UserInfoDAO;
import com.tdt.entity.UserInfo;
import com.tdt.service.UserInfoService;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UserInfoServiceImpl implements UserInfoService {

    @Inject
    private UserInfoDAO userInfoDAO;

    @Override
    public UserInfo loadUserInfo(int id) {
        return userInfoDAO.find(id);
    }

    @Override
    public UserInfo save(UserInfo userInfo) {
        try{
            userInfoDAO.create(userInfo);
            return userInfo;
        }catch (Exception e){
            return null;
        }

    }

    @Override
    public UserInfo delete(int id) {
        UserInfo info = userInfoDAO.find(id);
        userInfoDAO.delete(info);
        return info;
    }

    @Override
    public UserInfo update(UserInfo userInfo) {
        UserInfo info = userInfoDAO.find(userInfo.getId());
        if(info!=null){
            userInfoDAO.update(userInfo);
            return userInfo;
        }else{
            return null;
        }
    }
}
