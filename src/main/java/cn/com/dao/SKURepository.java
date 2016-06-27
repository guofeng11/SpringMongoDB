package cn.com.dao;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;


import cn.com.entity.SKU;

public interface SKURepository extends CrudRepository<SKU,Integer>{

	Page<SKU> findByNameContaining(String name,Pageable pageable);
	/**
	 * Returns all {@link Product}s having the given attribute.
	 * 
	 * @param attribute
	 * @return
	 */
	@Query("{ 'property.key':?0 ,'property.value':?1 }")
	List<SKU> findByProperty(String key, String value);
}
