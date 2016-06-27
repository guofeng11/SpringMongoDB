package cn.com.dao;


/*
 * 必需继承*Repository 否则需要在spring-dao中 配置bean
 */
public interface AISequenceRepository {
	
	Integer getNextSequence(String dbName,String collectionName,String sectionName);
}
