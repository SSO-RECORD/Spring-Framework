package com.ssafy.member.model.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssafy.member.model.MemberDto;
import com.ssafy.member.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	private MemberMapper memberMapper;
	
	public MemberServiceImpl(MemberMapper memberMapper) {
		super();
		this.memberMapper = memberMapper;
	}
	@Override
	public MemberDto loginMember(Map<String, String> map) {
		return memberMapper.loginMember(map);
	}
	@Override
	public void joinMember(MemberDto memberDto) {
		memberMapper.joinMember(memberDto);
		
	}

}
