package cn.com;

import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;

public class CustomMongoTypeMapper extends DefaultMongoTypeMapper {
	
	// DefaultMongoTypeMapper 传入null 表示存储结构中不保存_clss
	public CustomMongoTypeMapper() {
		super(null);
	}
}
