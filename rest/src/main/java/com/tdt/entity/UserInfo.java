package com.tdt.entity;

import org.exoplatform.commons.api.persistence.ExoEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@ExoEntity
@Table(name = "USER_INFO")
public class UserInfo {
    @Id
    @Column(
            name = "ID"
    )
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "USER_NAME")
    private String userName;

    public UserInfo(int id, String name, String userName) {
        this.id = id;
        this.name = name;
        this.userName = userName;
    }
    public UserInfo(String name, String userName) {
        this.name = name;
        this.userName = userName;
    }
    public UserInfo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
