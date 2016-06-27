package cn.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.com.dao.AISequenceRepository;
import cn.com.dao.SKURepository;
import cn.com.dto.O_CommonResult;
import cn.com.dto.O_SKU_A;
import cn.com.entity.SKU;

@RestController
@RequestMapping("/sku")
public class SKUServiceImpl implements SKUService{

	@Autowired
	private SKURepository skuRepository; 
	@Autowired
    private AISequenceRepository aiSequenceRepository;
	
	@RequestMapping(value="/say/{yourname}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@Override
	public String sayHello(@PathVariable("yourname") String yourName) {
		return yourName+": hello";
	}
	/*
	 * 根据sku 名称查找sku 默认10页
	 * (non-Javadoc)
	 * @see cn.com.service.SKUService#getSKUByName(java.lang.String, int, int)
	 */
	@RequestMapping(value="/{name}/{pageindex}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Override
	public List<SKU> getSKUByName(@PathVariable("name") String name,@PathVariable("pageindex") int page,@RequestParam(defaultValue="10") int pageSize) {
		//PageRequest 页数索引0开始
		Pageable pageable= new PageRequest(page-1, pageSize);
		Page<SKU> skuPage=skuRepository.findByNameContaining(name, pageable);
		return skuPage.getContent();
	}
	/*
	 * (non-Javadoc) 添加sku
	 * @see cn.com.service.SKUService#saveSKU(cn.com.entity.SKU)
	 */
	@RequestMapping(value="/save",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Override
	public O_CommonResult<O_SKU_A> saveSKU(SKU sku) {
		O_CommonResult<O_SKU_A> result=new O_CommonResult<O_SKU_A>();
		try {
			if (sku!=null) {
				sku.setId(aiSequenceRepository.getNextSequence("SKU", "SKU", "SKUID"));
				sku= skuRepository.save(sku);
				
				O_SKU_A oSku_A=new O_SKU_A();
				oSku_A.setSkuId(sku.getId());
				oSku_A.setSkuName(sku.getName());
				
				result.setResultFlag(0);
				result.setResulyMess("添加SKU成功");
				result.setResultObject(oSku_A);
				return result;
			}
			else {
				result.setResultFlag(1);
				result.setResulyMess("添加SKU失败");
				return result;
			}
		} catch (Exception e) {
			result.setResultFlag(2);
			result.setResulyMess(e.getMessage());
			return result;
		}

	}

    

}
