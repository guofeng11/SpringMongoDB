package cn.com.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="SKU")
public class SKU extends AbstractDocument{
	     
     private int productid;
     /// <summary>
     /// SKU的名称
     /// </summary>
     private String name ;
     /// <summary>
     /// 外部编码
     /// </summary>
     private String outcode ;
     /// <summary>
     /// 条码
     /// </summary>
     private String barcode ;
     /// <summary>
     /// 销售属性列表
     /// </summary>
     private List<PropertySection> property =new ArrayList<PropertySection>();
     /// <summary>
     /// 实际库存数量，即可售数量
     /// </summary>
     private BigDecimal amount ;
     /// <summary>
     /// 市场参考价格，这个仅用于显示市场当前的价格，是个虚数，不做实际处理
     /// </summary>
     private BigDecimal marketprice ;
     /// <summary>
     /// 当前参考价格
     /// </summary>
     private BigDecimal referenceprice ;
     /// <summary>
     /// 活动优惠价,如无优惠，price = referenceprice。显示时以这个价格为准
     /// </summary>
     private BigDecimal price ;
     
     private int isenable ;
     
     private UpdateLog updatelog ;
     /// <summary>
     /// 购买上限，优先级最高。0不限制
     /// </summary>
     private BigDecimal limitupper ;
     /// <summary>
     /// 购买下限，优先级最高。0不限制
     /// </summary>
     private BigDecimal limitlower ;
     /// <summary>
     /// 限购类型
     /// </summary>
     private int limittype ;
     /// <summary>
     /// 限购开始
     /// </summary>
     private Date limitstarttime ;
     /// <summary>
     /// 限购结束
     /// </summary>
     private Date limitendtime ;
     /// <summary>
     /// 父级SKUID
     /// </summary>        
     private int ParentID ;
     /// <summary>
     /// 送链端币数
     /// </summary>
     private double ldbout ;
     /// <summary>
     /// 送链端币总数
     /// </summary>
     private double ldbouttotal ;
     /// <summary>
     /// 锁定数量
     /// </summary>
     private double lockldb ;
     /// <summary>
     /// 使用链端类型1-不可使用，2-不限制使用3-限制使用数量（只用3时ldbuse有且大于0，其余是0）
     /// </summary>
     private int ldbusetype ;
     /// <summary>
     /// 使用数量
     /// </summary>
     private double ldbuse ;

     /// <summary>
     /// APP端活动优惠价,如无优惠，price = referenceprice。显示时以这个价格为准
     /// </summary>
     private BigDecimal appprice ;

     /// <summary>
     /// 微信端活动优惠价,如无优惠，price = referenceprice。显示时以这个价格为准
     /// </summary>
     private BigDecimal wxprice ;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOutcode() {
		return outcode;
	}

	public void setOutcode(String outcode) {
		this.outcode = outcode;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public List<PropertySection> getProperty() {
		return property;
	}

	public void setProperty(List<PropertySection> property) {
		this.property = property;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getMarketprice() {
		return marketprice;
	}

	public void setMarketprice(BigDecimal marketprice) {
		this.marketprice = marketprice;
	}

	public BigDecimal getReferenceprice() {
		return referenceprice;
	}

	public void setReferenceprice(BigDecimal referenceprice) {
		this.referenceprice = referenceprice;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getIsenable() {
		return isenable;
	}

	public void setIsenable(int isenable) {
		this.isenable = isenable;
	}

	public UpdateLog getUpdatelog() {
		return updatelog;
	}

	public void setUpdatelog(UpdateLog updatelog) {
		this.updatelog = updatelog;
	}

	public BigDecimal getLimitupper() {
		return limitupper;
	}

	public void setLimitupper(BigDecimal limitupper) {
		this.limitupper = limitupper;
	}

	public BigDecimal getLimitlower() {
		return limitlower;
	}

	public void setLimitlower(BigDecimal limitlower) {
		this.limitlower = limitlower;
	}

	public int getLimittype() {
		return limittype;
	}

	public void setLimittype(int limittype) {
		this.limittype = limittype;
	}

	public Date getLimitstarttime() {
		return limitstarttime;
	}

	public void setLimitstarttime(Date limitstarttime) {
		this.limitstarttime = limitstarttime;
	}

	public Date getLimitendtime() {
		return limitendtime;
	}

	public void setLimitendtime(Date limitendtime) {
		this.limitendtime = limitendtime;
	}

	public int getParentID() {
		return ParentID;
	}

	public void setParentID(int parentID) {
		ParentID = parentID;
	}

	public double getLdbout() {
		return ldbout;
	}

	public void setLdbout(double ldbout) {
		this.ldbout = ldbout;
	}

	public double getLdbouttotal() {
		return ldbouttotal;
	}

	public void setLdbouttotal(double ldbouttotal) {
		this.ldbouttotal = ldbouttotal;
	}

	public double getLockldb() {
		return lockldb;
	}

	public void setLockldb(double lockldb) {
		this.lockldb = lockldb;
	}

	public int getLdbusetype() {
		return ldbusetype;
	}

	public void setLdbusetype(int ldbusetype) {
		this.ldbusetype = ldbusetype;
	}

	public double getLdbuse() {
		return ldbuse;
	}

	public void setLdbuse(double ldbuse) {
		this.ldbuse = ldbuse;
	}

	public BigDecimal getAppprice() {
		return appprice;
	}

	public void setAppprice(BigDecimal appprice) {
		this.appprice = appprice;
	}

	public BigDecimal getWxprice() {
		return wxprice;
	}

	public void setWxprice(BigDecimal wxprice) {
		this.wxprice = wxprice;
	}
     
     
     
}
