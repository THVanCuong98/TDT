package com.tdt.dao;

import com.tdt.entity.UserInfo;
import org.exoplatform.commons.api.persistence.GenericDAO;

public interface UserInfoDAO extends GenericDAO<UserInfo, Integer>{

    UserInfo getOrCreate(UserInfo user);
}
