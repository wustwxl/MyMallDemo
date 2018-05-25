package com.wust.service;

import com.wust.dto.MallResult;
import com.wust.pojo.TbItemParam;

public interface ItemParamService {

	MallResult getItemParamByCid(long cid);
	MallResult insertItemParam(TbItemParam itemParam);
}
