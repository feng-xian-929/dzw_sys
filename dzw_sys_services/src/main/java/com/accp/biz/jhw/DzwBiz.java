package com.accp.biz.jhw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.jhw.UserMapper;
import com.accp.pojo.jhw.User;

@Service
public class DzwBiz {
	
	@Autowired
	private UserMapper userDao;
	
	public User cha(Integer id) {
		return userDao.selectByPrimaryKey(id);
	}
}
