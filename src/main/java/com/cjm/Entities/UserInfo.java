package com.cjm.Entities;

/**
 * Created by cjm on 7/5/17.
 */
public class UserInfo {
    private String userName;
    private String userPwd;

    public UserInfo(String username, String userpwd) {
        this.userName = username;
        this.userPwd = userpwd;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
