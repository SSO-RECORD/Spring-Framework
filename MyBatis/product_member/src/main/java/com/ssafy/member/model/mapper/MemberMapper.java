package com.ssafy.member.model.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.member.model.MemberDto;

@Mapper
public interface MemberMapper {

	MemberDto loginMember(Map<String, String> map);
	void joinMember(MemberDto memberDto);
}
