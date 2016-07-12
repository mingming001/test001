/**
 * 
 */
package com.liy.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ly  @date 2014-11-6
 *
 */
@Entity(name="tb_user")
//@Table(name="tb_user")
public class User extends BaseEntity {
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	private static final long serialVersionUID = 5396026276479099261L;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	private String userName;
	private String password;
	private int age;
	private String sex;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
}
