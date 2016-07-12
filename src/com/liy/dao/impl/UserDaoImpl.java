/**
 * 
 */
package com.liy.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.liy.dao.UserDao;
import com.liy.po.User;

/**
 * @author ly  @date 2014-11-10
 * Repositoryע���ܱ�spring��context��component-scanɨ�赽
 * 
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{
	
	private SessionFactory sessionFactory;
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	} 
	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	public void saveUser(User user) {
		currentSession().save(user);
	}
	
}
