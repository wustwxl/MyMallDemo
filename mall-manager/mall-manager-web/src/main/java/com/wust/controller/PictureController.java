package com.wust.controller;

import com.wust.service.PictureService;
import com.wust.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * 上传图片处理
 */
@Controller
public class PictureController {

	@Autowired
	private PictureService pictureService;

	@RequestMapping("/pic/upload")
	@ResponseBody
	public String pictureUpload(MultipartFile uploadFile) {
		Map result = pictureService.uploadPicture(uploadFile);
		String jsonString = JsonUtil.objectToJson(result);
		return jsonString;
	}
}
