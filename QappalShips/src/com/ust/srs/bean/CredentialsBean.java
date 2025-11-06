package com.ust.srs.bean;

public class CredentialsBean {
	private String userID;
	private String password;
	private String userType;
	private int loginStatus;
	
	public CredentialsBean() {}

    public CredentialsBean(String userID, String password,String userType,int loginStatus) {
        this.userID = userID;
        this.password = password;
        this.userType= userType;
        this.loginStatus=loginStatus;
    }


	public String getUserid() {
		return userID;
	}
	public void setUserid(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}
	

}
