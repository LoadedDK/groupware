package com.dk.groupware.data.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.dk.groupware.data.model.Data;

public class DataDao {

	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	// 글리스트
	public Object list() {
		System.out.println("DataDao.list()");
		return sqlSessionTemplate.selectList("dao.Data.list");
	}

	// 글보기 - 글수정
	public Object view(Object obj) {
		System.out.println("DataDao.view()");
		return sqlSessionTemplate.selectOne("dao.Data.view", obj);
	}

	// 글수정처리
	public Object update(Data data) {
		System.out.println("DataDao.update()");
		sqlSessionTemplate.update("dao.Data.update", data);
		return null;
	}

	// 글쓰기
	public Object write(Data data) {
		System.out.println("DataDao.write()");
		sqlSessionTemplate.insert("dao.Data.write", data);
		return null;
	}

	// 글삭제
	public Object delete(Object obj) {
		System.out.println("DataDao.delete()");
		sqlSessionTemplate.delete("dao.Data.delete", obj);
		return null;
	}
}