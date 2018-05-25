package com.wust.sso.service;

import com.wust.dto.MallResult;
import com.wust.pojo.TbUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {

	MallResult checkData(String content, Integer type);
	MallResult createUser(TbUser user);
	MallResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);
	MallResult getUserByToken(String token);
}
