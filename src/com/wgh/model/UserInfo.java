package com.wgh.model;

import java.util.Vector;


public class UserInfo {
	
	private static UserInfo user=new UserInfo();
	private Vector<String> vector=null;
	
	//constructor function
	private UserInfo()
	{
		this.vector=new Vector<String>();
		
	}
	//外界使用的instance 对象
	public static UserInfo getInstance()
	{
		//return the user we defined
		return user;
		
	}
	
	//增加用户
	public boolean addUser(String user)
	{
		if(user!=null){
		  this.vector.add(user);
		  return true;
		}
		else
			return false;
	}
	
	//返回用户列表
	@SuppressWarnings("unchecked")
	public Vector getList()
	{
		return vector;
	}
	
	//移出用户
	public void removeUser(String user)
	{
		if(user!=null)
		{
			vector.removeElement(user);
		}
		
	}
	
	

}
