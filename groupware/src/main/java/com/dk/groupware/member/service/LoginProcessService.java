package com.dk.groupware.member.service;

import com.dk.groupware.common.ServiceInterface;
import com.dk.groupware.member.dao.MemberDao;
import com.dk.groupware.member.model.Member;

public class LoginProcessService implements ServiceInterface{
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao){
		this.memberDao=memberDao;
	}

	@Override
	public Object service(Object obj){
		System.out.println("LoginProcessService.service()");
		return memberDao.login((Member)obj);
	}
}
