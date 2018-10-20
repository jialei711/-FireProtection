package com.beautifulhomes.platform.bean;


public class EquipmentBean{
	
	private String id;
	private String equipmentId;//设备编号
	private String customerId;//用户ID,设备属于某用户
	private String name;//设备名称
	private String kind;//设备类型
	private String purchaseDate;//购买日期,采用(yyyy-MM-dd)格式
	private String purchaseAddr;//购买地点
	private long purchasePrice;//购买价格
	private long purchaseIntegral;//购买积分(有可能,使用积分购买)
	private String warranty;//质保期限,按月记算,-1表于终生
	private String createDate;//设备添加日期,采用(yyyy-MM-dd)格式
	private String remark;//备注
	private Integer del;//删除标记
	private String ts;

	public EquipmentBean() {}

	public EquipmentBean(String id, String equipmentId, String customerId, String name, String kind,
			String purchaseDate, String purchaseAddr, long purchasePrice, long purchaseIntegral, String warranty,
			String createDate, String remark, Integer del, String ts) {
		super();
		this.id = id;
		this.equipmentId = equipmentId;
		this.customerId = customerId;
		this.name = name;
		this.kind = kind;
		this.purchaseDate = purchaseDate;
		this.purchaseAddr = purchaseAddr;
		this.purchasePrice = purchasePrice;
		this.purchaseIntegral = purchaseIntegral;
		this.warranty = warranty;
		this.createDate = createDate;
		this.remark = remark;
		this.del = del;
		this.ts = ts;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getPurchaseAddr() {
		return purchaseAddr;
	}

	public void setPurchaseAddr(String purchaseAddr) {
		this.purchaseAddr = purchaseAddr;
	}

	public long getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(long purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public long getPurchaseIntegral() {
		return purchaseIntegral;
	}

	public void setPurchaseIntegral(long purchaseIntegral) {
		this.purchaseIntegral = purchaseIntegral;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getDel() {
		return del;
	}

	public void setDel(Integer del) {
		this.del = del;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	@Override
	public String toString() {
		return "EquipmentBean [id=" + id + ", equipmentId=" + equipmentId + ", customerId=" + customerId + ", name="
				+ name + ", kind=" + kind + ", purchaseDate=" + purchaseDate + ", purchaseAddr=" + purchaseAddr
				+ ", purchasePrice=" + purchasePrice + ", purchaseIntegral=" + purchaseIntegral + ", warranty="
				+ warranty + ", createDate=" + createDate + ", remark=" + remark + ", del=" + del + ", ts=" + ts + "]";
	}

}
