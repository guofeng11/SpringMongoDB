package cn.com;

/*import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoTypeMapper;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@ComponentScan
@EnableMongoRepositories
public class ApplicationConfig extends AbstractMongoConfiguration {

	@Autowired
	private List<Converter<?, ?>> converters;
	 
	 * (non-Javadoc)
	 * @see org.springframework.data.mongodb.config.AbstractMongoConfiguration#getDatabaseName()
	 
	@Override
	protected String getDatabaseName() {
		return "database";
	}

	 
	 * (non-Javadoc)
	 * @see org.springframework.data.mongodb.config.AbstractMongoConfiguration#mongo()
	 
	@Override
	public Mongo mongo() throws Exception {

		Mongo mongo = new MongoClient();

		return mongo;
	}

	 
	 * (non-Javadoc)
	 * @see org.springframework.data.mongodb.config.AbstractMongoConfiguration#customConversions()
	 
	@Override
	public CustomConversions customConversions() {
		return new CustomConversions(converters);
	}
	
	 * 去掉 _class
	 
	@Bean
	@Override
	public MappingMongoConverter mappingMongoConverter() throws Exception {
		MappingMongoConverter mmc = super.mappingMongoConverter();
	    mmc.setTypeMapper(customTypeMapper());
	    return mmc;
	}
	@Bean
	  public MongoTypeMapper customTypeMapper() {
	    return new CustomMongoTypeMapper();
	  }

}
*/
