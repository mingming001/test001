/**
 * 
 */
package com.liy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liy.dao.UserDao;
import com.liy.po.User;
import com.liy.service.UserService;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author ly  @date 2014-11-10
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	public void registerUser(User user) {
		userDao.saveUser(user);
	}

}
