package com.tdt.model;

import java.util.ArrayList;
import java.util.List;

public class UserGroup {
  private String id;
  private String name;
  private String displayName;

  private List<UserGroup> children = new ArrayList<UserGroup>();

  public UserGroup(String id, String name, String displayName) {
    this.id = id;
    this.name = name;
    this.displayName = displayName;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public List<UserGroup> getChildren() {
    return children;
  }

  public void setChildren(List<UserGroup> children) {
    this.children = children;
  }

  public void addChild(UserGroup group) {
    this.children.add(group);
  }
}
