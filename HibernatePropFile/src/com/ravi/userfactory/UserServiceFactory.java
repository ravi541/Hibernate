package com.ravi.userfactory;

import com.ravi.userservice.UserService;
import com.ravi.userservice.UserServiceImp;

public class UserServiceFactory {
	private static UserService userservice;
	static
	{
		userservice=new UserServiceImp();
	}
	public static UserService getuserservice()
	{
		return userservice;
	}

}
