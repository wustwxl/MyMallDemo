package com.wust.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wust.dto.EasyUIData;
import com.wust.dto.MallResult;
import com.wust.mapper.TbItemDescMapper;
import com.wust.mapper.TbItemMapper;
import com.wust.mapper.TbItemParamItemMapper;
import com.wust.pojo.TbItem;
import com.wust.pojo.TbItemDesc;
import com.wust.pojo.TbItemExample;
import com.wust.pojo.TbItemParamItem;
import com.wust.service.ItemService;
import com.wust.utils.IDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private TbItemMapper itemMapper;

	@Autowired
	private TbItemDescMapper itemDescMapper;


	@Autowired
	private TbItemParamItemMapper itemParamItemMapper;

	@Override
	public TbItem getItemById(long itemId) {

		return itemMapper.selectByPrimaryKey(itemId);
	}

	@Override
	public EasyUIData getItemList(int page, int rows) {

		//查询商品列表
		TbItemExample example = new TbItemExample();
		//分页处理
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(example);
		//创建一个返回值对象
		EasyUIData result = new EasyUIData();
		result.setRows(list);
		//取记录总条数
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;

	}

	/**
	 * 12164
	 * 2926
	 */
	/**
	 * 添加商品
	 * @param item
	 * @param desc
	 * @param itemParam
	 * @return
	 * @throws Exception
	 */
	@Override
	public MallResult addItem(TbItem item, String desc, String itemParam) throws Exception{
		//item补全
		//生成商品ID
		Long itemId = IDUtil.genItemId();
		item.setId(itemId);
		// '商品状态，1-正常，2-下架，3-删除',
		item.setStatus((byte) 1);
		item.setCreated(new Date());
		item.setUpdated(new Date());
		//插入到数据库
		itemMapper.insert(item);

		//添加商品描述信息
		MallResult result = insertItemDesc(itemId, desc);
		if (result.getStatus() != 200) {
			throw new Exception();
		}
		//添加规格参数
		result = insertItemParamItem(itemId, itemParam);
		if (result.getStatus() != 200) {
			throw new Exception();
		}

		return MallResult.ok();
	}

	/**
	 * 添加商品描述
	 */
	private MallResult insertItemDesc(Long itemId, String desc) {
		TbItemDesc itemDesc = new TbItemDesc();
		itemDesc.setItemId(itemId);
		itemDesc.setItemDesc(desc);
		itemDesc.setCreated(new Date());
		itemDesc.setUpdated(new Date());
		itemDescMapper.insert(itemDesc);
		return MallResult.ok();
	}

	/**
	 * 添加规格参数
	 */
	private MallResult insertItemParamItem(Long itemId, String itemParam) {
		//创建一个pojo
		TbItemParamItem itemParamItem = new TbItemParamItem();
		itemParamItem.setItemId(itemId);
		itemParamItem.setParamData(itemParam);
		itemParamItem.setCreated(new Date());
		itemParamItem.setUpdated(new Date());
		//向表中插入数据
		itemParamItemMapper.insert(itemParamItem);

		return MallResult.ok();

	}
}
