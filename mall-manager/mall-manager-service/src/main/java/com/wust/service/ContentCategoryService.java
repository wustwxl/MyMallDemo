package com.wust.service;

import com.wust.dto.EUTreeNode;
import com.wust.dto.MallResult;

import java.util.List;

public interface ContentCategoryService {

	List<EUTreeNode> getCategoryList(long parentId);
	MallResult insertContentCategory(long parentId, String name);
}
