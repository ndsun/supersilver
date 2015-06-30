package com.supersilver.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.supersilver.dao.TbUserMapper;
import com.supersilver.entity.TbUser;
import com.supersilver.entity.TbUserExample;

@Repository
public class TbUserDaoImpl implements TbUserMapper {
	
	@Resource
	private SqlSession sqlSession;
	
	private static final String NAME_SPACE = "com.supersilver.mybatis.dao.TbUserMapper";

	public int countByExample(TbUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByExample(TbUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByPrimaryKey(Long userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(TbUser record) {
		
		return sqlSession.insert(NAME_SPACE + ".insert", record);
	}

	public int insertSelective(TbUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<TbUser> selectByExample(TbUserExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	public TbUser selectByPrimaryKey(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByExampleSelective(TbUser record, TbUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByExample(TbUser record, TbUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(TbUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(TbUser record) {
		// TODO Auto-generated method stub
		return 0;
	}


}
