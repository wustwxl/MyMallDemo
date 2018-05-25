package com.wust.order.service;

import com.wust.dto.MallResult;
import com.wust.pojo.TbOrder;
import com.wust.pojo.TbOrderItem;
import com.wust.pojo.TbOrderShipping;

import java.util.List;

public interface OrderService {

	MallResult createOrder(TbOrder order, List<TbOrderItem> itemList, TbOrderShipping orderShipping);
}
