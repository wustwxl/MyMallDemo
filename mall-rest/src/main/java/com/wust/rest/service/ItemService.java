package com.wust.rest.service;

import com.wust.dto.MallResult;

public interface ItemService {

	MallResult getItemBaseInfo(long itemId);
	MallResult getItemDesc(long itemId);
	MallResult getItemParam(long itemId);
}
