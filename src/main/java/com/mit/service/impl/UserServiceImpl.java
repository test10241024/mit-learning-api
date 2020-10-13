package com.mit.service.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mit.dao.IUserDao;
import com.mit.model.user.User;
import com.mit.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
