package cn.com.dto;

/*
 * 通用返回数据类型
 * resultFlag默认为0 表示成功，其余参考具体服务
 * resulyMess返回消息，默认为空，参考具体服务
 * resultObject 返回对象，默认为null，参考具体服务
 */
public class O_CommonResult<T> {

	private int resultFlag=0;
	private String resulyMess="";
	private T resultObject;
	public int getResultFlag() {
		return resultFlag;
	}
	public void setResultFlag(int resultFlag) {
		this.resultFlag = resultFlag;
	}
	public String getResulyMess() {
		return resulyMess;
	}
	public void setResulyMess(String resulyMess) {
		this.resulyMess = resulyMess;
	}
	public T getResultObject() {
		return resultObject;
	}
	public void setResultObject(T resultObject) {
		this.resultObject = resultObject;
	}
	
	
}
