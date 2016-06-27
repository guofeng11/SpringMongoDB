package cn.com.service;




import java.util.ArrayList;
import java.util.List;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.dto.O_CommonResult;
import cn.com.dto.O_SKU_A;
import cn.com.entity.PropertySection;
import cn.com.entity.SKU;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class SKUServiceImplTest {

//	private Log LOG = LogFactory.getLog(this.getClass());
	
	@Autowired
	private  SKUService skuService;
	@Test
	public void testSayHello() {
		String name="test";
		String oString= skuService.sayHello(name);
		System.out.println(oString);
	}
	@Test
	public void getSKUByNameTest()
	{
		List<SKU> skus=skuService.getSKUByName("test", 1, 10);
		for (SKU sku : skus) {
			System.out.println(sku.getId()+":"+sku.getName());
		}
		
	}
	@Test
	public void saveSKUTest() {
		SKU sku=new SKU();
		sku.setName("test");
		PropertySection property =new PropertySection();
		property.setKey("test");
		property.setValue("赵昱程");
		List<PropertySection> propertySections=new ArrayList<PropertySection>();
		propertySections.add(property);
		sku.setProperty(propertySections);
		
		O_CommonResult<O_SKU_A> result = skuService.saveSKU(sku);
		System.out.println(result.getResultFlag()+":"+ result.getResulyMess()+" "+result.getResultObject().toString());
	}
   
}
