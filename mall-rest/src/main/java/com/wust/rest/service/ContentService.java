package com.wust.rest.service;

import com.wust.pojo.TbContent;

import java.util.List;

public interface ContentService {
	List<TbContent> getContentList(long contentCid);
}
