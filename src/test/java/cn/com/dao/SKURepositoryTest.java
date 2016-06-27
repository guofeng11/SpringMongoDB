package cn.com.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.entity.SKU;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = { "classpath:spring/spring-dao.xml", "classpath:spring/spring-servlet.xml" })
public class SKURepositoryTest {

	@Autowired
	private SKURepository skuRepository;

	@Test
	public void testFindByNameContaining() {
		Pageable pageable = new PageRequest(1, 10);
		Page<SKU> sku = skuRepository.findByNameContaining("牛栏山", pageable);
		for (SKU s : sku) {
			System.out.println(s.getId() + ":" + s.getName());
		}

	}

	@Test
	public void testFindByProperty() {

		List<SKU> skus = skuRepository.findByProperty("test", "赵昱程");
		if (skus.isEmpty()) {
			System.out.println("没有数据");
		} else {
			for (SKU sku : skus) {
				System.out.println(sku.getName());
			}
		}
	}
}
