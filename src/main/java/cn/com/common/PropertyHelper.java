package cn.com.common;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Properties;

/*
 * 属性操作通用类
 * 文件路径为/*properties（对应src/main/resource）
 * 可以使用前置反斜线（/）表示这是一个绝对路径，而不使用前置反斜线（/）的时候表示一个相对路径
 */
public class PropertyHelper {

	//项目中属性文件
	private String propertyFile;
	

	Properties properties = new Properties();//属性集合对象 
	
	public String getPropertyFile() {
		return propertyFile;
	}
	
	public Properties getProperties() {
		return properties;
	}

	public PropertyHelper(String propertyFile) {
		this.propertyFile = propertyFile;
	}
	
	public String getProperty(String key) throws IOException {
		//获取路径并转换成流
		InputStream inputStream=getClass().getResourceAsStream(propertyFile);
		//将属性文件流装载到Properties对象中
		properties.load(inputStream);
		inputStream.close();
		return properties.getProperty(key);
	}
	
	public void setProperty(String key,String value) throws IOException {
		    URL url=getClass().getResource(propertyFile);
			//调用 Hashtable 的方法 put。使用 getProperty 方法提供并行性。
	        //强制要求为属性的键和值使用字符串。返回值是 Hashtable 调用 put 的结果。
	        OutputStream outputStream = new FileOutputStream(url.getPath());
	        
	        properties.setProperty(key, value);
	        //以适合使用 load 方法加载到 Properties 表中的格式，
	        //将此 Properties 表中的属性列表（键和元素对）写入输出流
	        properties.store(outputStream, "Update '" + key + "' value");

	        outputStream.close();		 
	}
}
