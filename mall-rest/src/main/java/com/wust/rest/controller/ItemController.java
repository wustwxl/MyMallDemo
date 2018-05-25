package com.wust.rest.controller;

import com.wust.dto.MallResult;
import com.wust.rest.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品信息Controller
 */
@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/info/{itemId}")
	@ResponseBody
	public MallResult getItemBaseInfo(@PathVariable Long itemId) {
		MallResult result = itemService.getItemBaseInfo(itemId);
		return result;
	}
	
	@RequestMapping("/desc/{itemId}")
	@ResponseBody
	public MallResult getItemDesc(@PathVariable Long itemId) {
		MallResult result = itemService.getItemDesc(itemId);
		return result;
	}
	
	@RequestMapping("/param/{itemId}")
	@ResponseBody
	public MallResult getItemParam(@PathVariable Long itemId) {
		MallResult result = itemService.getItemParam(itemId);
		return result;
	}
}
