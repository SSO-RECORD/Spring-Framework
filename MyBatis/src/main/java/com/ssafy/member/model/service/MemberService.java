package com.ssafy.member.model.service;

import java.util.Map;

import com.ssafy.member.model.MemberDto;

public interface MemberService {
	MemberDto loginMember(Map<String, String> map);
	void joinMember(MemberDto memberDto);
}
