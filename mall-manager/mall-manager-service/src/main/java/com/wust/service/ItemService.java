package com.wust.service;

import com.wust.dto.EasyUIData;
import com.wust.dto.MallResult;
import com.wust.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);

	EasyUIData getItemList(int page, int rows);

	MallResult addItem(TbItem item, String desc, String itemParam) throws Exception;
}
