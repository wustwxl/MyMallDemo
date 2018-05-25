package com.wust.portal.service;

import com.wust.pojo.TbUser;

public interface UserService {

	TbUser getUserByToken(String token);
}
