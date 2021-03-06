package com.checkmate.service;

import java.util.List;

import com.checkmate.vo.GroupVO;
import com.checkmate.vo.UserVO;

public interface UserService {
	
	public void register(UserVO userVO) throws Exception;
	
	public UserVO login(UserVO userVO) throws Exception;
	
	public UserVO userinfo(String u_id) throws Exception;
	
	// 소셜 로그인으로 우리 디비에 회원가입 자동으로
	public void socialReg(UserVO userVO) throws Exception;
		
	// 소셜 계정으로 디비에 저장된 정보가 있는지 카운트
	public int socialAlreadyChk(UserVO userVO) throws Exception;
	
	// 그룹 user정보 list 가져오기
	public List<UserVO> userList(GroupVO groupVO) throws Exception;
	
	// 그룹 user정보 list 개수 카운트
	public int userListCount(GroupVO groupVO) throws Exception;

}