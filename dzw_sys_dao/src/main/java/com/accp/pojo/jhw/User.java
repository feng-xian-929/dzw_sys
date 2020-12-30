package com.accp.pojo.jhw;

import java.util.Date;

public class User {
    private Integer userid;

    private Integer armemberid;

    private String userno;

    private String username;

    private String arvehiclekm;

    private String userphone;

    private String useraddress;

    private Date usertime;

    private String usercomment;

    private Float uamount;

    private Integer uintegral;

    private String signupaddress;

    private Integer isvip;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getArmemberid() {
        return armemberid;
    }

    public void setArmemberid(Integer armemberid) {
        this.armemberid = armemberid;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getArvehiclekm() {
        return arvehiclekm;
    }

    public void setArvehiclekm(String arvehiclekm) {
        this.arvehiclekm = arvehiclekm == null ? null : arvehiclekm.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public Date getUsertime() {
        return usertime;
    }

    public void setUsertime(Date usertime) {
        this.usertime = usertime;
    }

    public String getUsercomment() {
        return usercomment;
    }

    public void setUsercomment(String usercomment) {
        this.usercomment = usercomment == null ? null : usercomment.trim();
    }

    public Float getUamount() {
        return uamount;
    }

    public void setUamount(Float uamount) {
        this.uamount = uamount;
    }

    public Integer getUintegral() {
        return uintegral;
    }

    public void setUintegral(Integer uintegral) {
        this.uintegral = uintegral;
    }

    public String getSignupaddress() {
        return signupaddress;
    }

    public void setSignupaddress(String signupaddress) {
        this.signupaddress = signupaddress == null ? null : signupaddress.trim();
    }

    public Integer getIsvip() {
        return isvip;
    }

    public void setIsvip(Integer isvip) {
        this.isvip = isvip;
    }
}