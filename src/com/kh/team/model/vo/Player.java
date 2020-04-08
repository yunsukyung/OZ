package com.kh.team.model.vo;

public class Player {
	
	private String userId;		//���� ���̵�
	private String userPwd;		//���� ��й�ȣ
	private String userName;	//�����г���
	private String phoneNumber;	//�ڵ�����ȣ
	private String email;
	//�̸���
	public static int pearl;	//����
	public static int garbage;	//������
	public static int sp;		//���ݷ�
	public static int satiety;	//������
	public Player(String userId, String userPwd, String userName, String phoneNumber, String email, int pearl,
			int garbage, int sp, int satiety) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		Player.pearl = pearl;
		Player.garbage = garbage;
		Player.sp = sp;
		Player.satiety = satiety;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static int getPearl() {
		return pearl;
	}
	public static void setPearl(int pearl) {
		Player.pearl = pearl;
	}
	public static int getGarbage() {
		return garbage;
	}
	public static void setGarbage(int garbage) {
		Player.garbage = garbage;
	}
	public static int getSp() {
		return sp;
	}
	public static void setSp(int sp) {
		Player.sp = sp;
	}
	public static int getSatiety() {
		return satiety;
	}
	public static void setSatiety(int satiety) {
		Player.satiety = satiety;
	}
	 
}

