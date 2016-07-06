package cn.com.entity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * 自增序列
 */
@Document(collection="IDSC")
public class IDS {
	
    private ObjectId _id;
    /// <summary>
    /// 数据库名称
    /// </summary>
    private String dbname="SKU"; 
    /// <summary>
    /// 数据集（表）名称
    /// </summary>
    private String collectionname="SKU";
    /// <summary>
    /// 字段名称
    /// </summary>
    private String schema ;
    
    private Integer currentidvalue ;

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	public String getCollectionname() {
		return collectionname;
	}

	public void setCollectionname(String collectionname) {
		this.collectionname = collectionname;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public Integer getCurrentidvalue() {
		return currentidvalue;
	}

	public void setCurrentidvalue(Integer currentidvalue) {
		this.currentidvalue = currentidvalue;
	}
    

}
