package com.crm.service;

import java.util.List;

import com.crm.entity.Users;

public interface LoginService {
	List<Users> selectUsers();
	
	Integer updateUsers(Users users);
	//Integer updateUsersRtp(Users users);
	Users selectUsersPass(Users users);
	
	/**
	 * 修改个人信息
	 * @param uid
	 * @return
	 */
	Integer updatePim(Users users);
}
