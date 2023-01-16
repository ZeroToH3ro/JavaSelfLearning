package com.demo.model;

public class UserModel {
    private String userName;
    private String fullName;

    public UserModel(String userName, String fullName) {
        this.userName = userName;
        this.fullName = fullName;
    }
    public UserModel() {
    }
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    @Override
    public String toString() {
        return "UserModel [userName=" + userName + ", fullName=" + fullName + "]";
    }
  
}
