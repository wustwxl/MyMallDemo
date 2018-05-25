package com.wust.service;

import com.wust.pojo.TbItemCat;

import java.util.List;

public interface ItemCatService {

	List<TbItemCat> getItemCatList(Long parentId);
}
