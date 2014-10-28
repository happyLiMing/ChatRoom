package com.wgh.servlet;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import com.wgh.model.UserInfo;

public class UserListener implements HttpSessionBindingListener {

	public String user; 
	//获取在线监听
	public String getUser() {
		return user;
	}
	//设置在线监听人员
	public void setUser(String user) {
		this.user = user;
	}

	private UserInfo container=UserInfo.getInstance();
	public UserListener() {
		// TODO Auto-generated constructor stub
	}

	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("上线用户："+this.user);
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println("下线用户："+this.user);
		if(user!="")
		{
			container.removeUser(user);
		}

	}

}
