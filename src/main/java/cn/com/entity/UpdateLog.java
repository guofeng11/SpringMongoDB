package cn.com.entity;

import java.util.Date;

public class UpdateLog {

	 /// <summary>
    /// 操作用户
    /// </summary>
    public int actionuserid;
    /// <summary>
    /// 最后更新时间
    /// </summary>
    public Date lastupdated;
    /// <summary>
    /// 创建时间
    /// </summary>
    public Date createdtime ;
    
	public int getActionuserid() {
		return actionuserid;
	}
	public void setActionuserid(int actionuserid) {
		this.actionuserid = actionuserid;
	}
	public Date getLastupdated() {
		return lastupdated;
	}
	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}
	public Date getCreatedtime() {
		return createdtime;
	}
	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}
    
    
}
