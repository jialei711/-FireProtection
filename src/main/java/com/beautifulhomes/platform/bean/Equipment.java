package com.beautifulhomes.platform.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="equipment")
public class Equipment{
	
	private String id;
	private String equipmentId;//设备编号
	private String customerId;//用户ID,设备属于某用户
	private String name;//设备名称
	private String kind;//设备类型
	private Date purchaseDate;//购买日期,采用(yyyy-MM-dd)格式
	private String purchaseAddr;//购买地点
	private long purchasePrice;//购买价格
	private long purchaseIntegral;//购买积分(有可能,使用积分购买)
	private String warranty;//质保期限,按月记算,-1表于终生
	private Date createDate;//设备添加日期,采用(yyyy-MM-dd)格式
	private String remark;//备注
	private Integer del;//删除标记
	private Date ts;

	public Equipment() {}
	
	public Equipment(String id, String equipmentId, String customerId, String name, String kind, Date purchaseDate,
			String purchaseAddr, long purchasePrice, long purchaseIntegral, String warranty, Date createDate,
			String remark, Integer del, Date ts) {
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

	@Id
    @GeneratedValue(generator = "IdGenerator")
    @GenericGenerator(name = "IdGenerator", strategy = "uuid")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name="equipment_id")
	public String getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	@Column(name="customer_id")
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="kind")
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Column(name="purchase_date")
	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Column(name="purchase_addr")
	public String getPurchaseAddr() {
		return purchaseAddr;
	}

	public void setPurchaseAddr(String purchaseAddr) {
		this.purchaseAddr = purchaseAddr;
	}

	@Column(name="purchase_price")
	public long getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(long purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	@Column(name="purchase_integral")
	public long getPurchaseIntegral() {
		return purchaseIntegral;
	}

	public void setPurchaseIntegral(long purchaseIntegral) {
		this.purchaseIntegral = purchaseIntegral;
	}

	@Column(name="warranty")
	public String getWarranty() {
		return warranty;
	}

	
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	@Column(name="create_date")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name="remark")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name="del")
	public Integer getDel() {
		return del;
	}

	public void setDel(Integer del) {
		this.del = del;
	}

	@Column(name="ts")
	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

	@Override
	public String toString() {
		return "Equipment [id=" + id + ", equipmentId=" + equipmentId + ", customerId=" + customerId + ", name=" + name
				+ ", kind=" + kind + ", purchaseDate=" + purchaseDate + ", purchaseAddr=" + purchaseAddr
				+ ", purchasePrice=" + purchasePrice + ", purchaseIntegral=" + purchaseIntegral + ", warranty="
				+ warranty + ", createDate=" + createDate + ", remark=" + remark + ", del=" + del + ", ts=" + ts + "]";
	}

}
