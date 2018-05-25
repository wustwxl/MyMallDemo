package com.wust.controller;

import com.wust.dto.MallResult;
import com.wust.pojo.TbContent;
import com.wust.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 内容管理Controller
 */
@Controller
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private ContentService contentService;

	@RequestMapping("/save")
	@ResponseBody
	public MallResult insertContent(TbContent content) {
		MallResult result = contentService.insertContent(content);
		return result;
	}
}
