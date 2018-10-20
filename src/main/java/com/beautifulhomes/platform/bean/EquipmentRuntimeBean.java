package com.beautifulhomes.platform.bean;


public class EquipmentRuntimeBean{
	
	private String id;
	private String equipmentId;//设备编号
	private String firstDate;//首次使用日期,采用(yyyy-MM-dd)格式
	private String lastDate;//最后使用日期,采用(yyyy-MM-dd)格式
	private String powerOn;//开机时间,采用(yyyy-MM-dd HH:mm:ss)格式
	private String powerOff;//关机时间,采用(yyyy-MM-dd HH:mm:ss)格式
	private long total;//总累计量(不同类型的设备,表示的含义不同)
	private long dailyTotal;//购买积分(有可能,使用积分购买)
	private long parameter;//设备指数:如页面的净水指数
	private String status;//设备的运行状态(运行或停止),on 或者 off
	private String remark;//备注
	private Integer del;//删除标记
	private String ts;

	public EquipmentRuntimeBean() {}

	public EquipmentRuntimeBean(String id, String equipmentId, String firstDate, String lastDate, String powerOn,
			String powerOff, long total, long dailyTotal, long parameter, String status, String remark, Integer del,
			String ts) {
		super();
		this.id = id;
		this.equipmentId = equipmentId;
		this.firstDate = firstDate;
		this.lastDate = lastDate;
		this.powerOn = powerOn;
		this.powerOff = powerOff;
		this.total = total;
		this.dailyTotal = dailyTotal;
		this.parameter = parameter;
		this.status = status;
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

	public String getFirstDate() {
		return firstDate;
	}

	public void setFirstDate(String firstDate) {
		this.firstDate = firstDate;
	}

	public String getLastDate() {
		return lastDate;
	}

	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	public String getPowerOn() {
		return powerOn;
	}

	public void setPowerOn(String powerOn) {
		this.powerOn = powerOn;
	}

	public String getPowerOff() {
		return powerOff;
	}

	public void setPowerOff(String powerOff) {
		this.powerOff = powerOff;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getDailyTotal() {
		return dailyTotal;
	}

	public void setDailyTotal(long dailyTotal) {
		this.dailyTotal = dailyTotal;
	}

	public long getParameter() {
		return parameter;
	}

	public void setParameter(long parameter) {
		this.parameter = parameter;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		return "EquipmentRuntimeBean [id=" + id + ", equipmentId=" + equipmentId + ", firstDate=" + firstDate
				+ ", lastDate=" + lastDate + ", powerOn=" + powerOn + ", powerOff=" + powerOff + ", total=" + total
				+ ", dailyTotal=" + dailyTotal + ", parameter=" + parameter + ", status=" + status + ", remark="
				+ remark + ", del=" + del + ", ts=" + ts + "]";
	}
	
}
