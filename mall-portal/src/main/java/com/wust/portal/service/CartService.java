package com.wust.portal.service;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wust.dto.MallResult;
import com.wust.portal.pojo.CartItem;

public interface CartService {

	MallResult addCartItem(long itemId, int num, HttpServletRequest request, HttpServletResponse response);
	List<CartItem> getCartItemList(HttpServletRequest request, HttpServletResponse response);
	MallResult deleteCartItem(long itemId, HttpServletRequest request, HttpServletResponse response);
}
