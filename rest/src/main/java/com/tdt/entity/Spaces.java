package com.tdt.entity;

import org.exoplatform.commons.api.persistence.ExoEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@ExoEntity
@Table(name = "USER_INFO")
public class Spaces {
    @Id
    @Column(
            name = "ID"
    )
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "USER_NAME")
    private String userName;

    public Spaces(long id, String name, String userName) {
        this.id = id;
        this.name = name;
        this.userName = userName;
    }

    public Spaces() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
