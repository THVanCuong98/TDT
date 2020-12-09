package com.tdt.dao.impl;

import com.tdt.dao.UserInfoDAO;
import com.tdt.entity.UserInfo;
import org.exoplatform.commons.persistence.impl.GenericDAOJPAImpl;

import java.util.Objects;

public class UserInfoDAOImpl extends GenericDAOJPAImpl<UserInfo, Integer> implements UserInfoDAO {

    @Override
    public UserInfo getOrCreate(UserInfo userInfo) {
        if (Objects.nonNull(userInfo)) {
            userInfo = this.create(userInfo);
            getEntityManager().flush();
        }
        return userInfo;
    }
}
