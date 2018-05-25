package com.wust.controller;

import com.wust.dto.EasyUIData;
import com.wust.dto.MallResult;
import com.wust.pojo.TbItem;
import com.wust.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId){
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}

	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIData getItemList(Integer page, Integer rows) {
		EasyUIData result = itemService.getItemList(page, rows);
		return result;
	}

	@RequestMapping(value="/item/save", method= RequestMethod.POST)
	@ResponseBody
	private MallResult createItem(TbItem item, String desc, String itemParams) throws Exception {
		MallResult result = itemService.addItem(item, desc, itemParams);
		return result;
	}
}
