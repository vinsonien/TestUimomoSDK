package com.test.sdk.uimomo.bean;

/**
 * @author: S
 * @date: 2018/12/5 13:46
 * @description:
 */
public class User {

    /**
     * username : admin
     * password : admin
     */

    private String username;
    private String password;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * pno=&ps=&dtype=&key=767fd259964d2c78a461ae1b1b7163d6
     */
//    private String pno = "";
//    private String ps = "";
//    private String dtype = "";
    private String key = "767fd259964d2c78a461ae1b1b7163d6";

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
