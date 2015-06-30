package com.supersilver.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.supersilver.dao.impl.TbUserDaoImpl;
import com.supersilver.entity.TbUser;

@Service
public class TbUserServiceImpl {
	
	@Resource
	TbUserDaoImpl tbUserDaoImpl;
	
	public int insert(TbUser record) {
		return tbUserDaoImpl.insert(record);
	}

}
