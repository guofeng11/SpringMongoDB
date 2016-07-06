package cn.com.dto;

/*
 * 增加sku 返回
 */
public class O_SKU_A {

	private int skuId;
	private String skuName;
	
	@Override
	public String toString() {
		return "O_SKU_A [skuId=" + skuId + ", skuName=" + skuName + "]";
	}
	
	public int getSkuId() {
		return skuId;
	}
	public void setSkuId(int skuId) {
		this.skuId = skuId;
	}
	public String getSkuName() {
		return skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	
	
}
