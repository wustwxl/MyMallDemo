package com.wust.rest.controller;

import com.wust.dto.MallResult;
import com.wust.rest.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 缓存同步Controller
 */
@Controller
@RequestMapping("/cache/sync")
public class RedisController {

	@Autowired
	private RedisService redisService;
	
	@RequestMapping("/content/{contentCid}")
	@ResponseBody
	public MallResult contentCacheSync(@PathVariable Long contentCid) {
		MallResult result = redisService.syncContent(contentCid);
		return result;
	}
}
