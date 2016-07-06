package cn.com.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import cn.com.entity.IDS;

@Repository
@Profile("mongodb")
public class AISequenceRepositoryImpl implements AISequenceRepository {

	@Autowired
    @Qualifier("mongoTemplateIDS")
	private MongoTemplate  mongoTemplateIDS ;
	

	
    public Integer getNextSequence(String dbName,String collectionName,String sectionName) {
    	
      Query query = new Query(Criteria.where("dbname").is(dbName)
    		  .and("collectionname").is(collectionName)
    		  .and("schema").is(sectionName)
          );
      Update update=new Update().inc("currentidvalue", 1);
      //返回设置
      FindAndModifyOptions options=new FindAndModifyOptions();
      options.upsert(true);
      options.returnNew(true);
      //查找并返回新实例
      IDS ids= mongoTemplateIDS.findAndModify(query, update, options,IDS.class);

//      args.SortBy = SortBy.Descending("_id");
//      args.Fields = Fields.Include("currentidvalue").Exclude("_id");
//
//      FindAndModifyResult result = collection.FindAndModify(args);
//
  	     return ids.getCurrentidvalue();
	}







}
