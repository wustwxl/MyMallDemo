package com.wust.rest.service;

import com.wust.dto.MallResult;

public interface RedisService {

	MallResult syncContent(long contentCid);
}
