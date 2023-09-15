package com.osoondosson.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osoondosson.vo.UserVO;

@Repository("MyPageDAO")
public class MyPageDAOImpl implements MyPageDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public UserVO selectMyPage(String userId) {
		System.out.println("==> mybatis selectMyPage() 호출 ");
		return mybatis.selectOne("com.osoondosson.dao.MyPageDAO.selectMyPage", userId);
	}

	@Override
	public void updateMyPage(UserVO vo) {
		System.out.println("==> mybatis updateMyPage() 호출 ");
		mybatis.update("com.osoondosson.dao.MyPageDAO.updateMyPage", vo);
	}
	
	

}
