package cn.com.service;

import java.util.List;

import cn.com.dto.O_CommonResult;
import cn.com.dto.O_SKU_A;
import cn.com.entity.SKU;

public interface SKUService {

	String sayHello(String yourName);
	
	List<SKU> getSKUByName(String name,int page, int pageSize);
	
	O_CommonResult<O_SKU_A> saveSKU(SKU sku);
}
