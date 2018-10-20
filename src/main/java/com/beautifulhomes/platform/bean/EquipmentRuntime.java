package com.beautifulhomes.platform.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="equipment_runtime")
public class EquipmentRuntime{
	
	private String id;
	private String equipmentId;//设备编号
	private String firstDate;//首次使用日期,采用(yyyy-MM-dd)格式
	private String lastDate;//最后使用日期,采用(yyyy-MM-dd)格式
	private Date powerOn;//开机时间,采用(yyyy-MM-dd HH:mm:ss)格式
	private Date powerOff;//关机时间,采用(yyyy-MM-dd HH:mm:ss)格式
	private long total;//总累计量(不同类型的设备,表示的含义不同)
	private long dailyTotal;//购买积分(有可能,使用积分购买)
	private long parameter;//设备指数:如页面的净水指数
	private String status;//设备的运行状态(运行或停止),on 或者 off
	private String remark;//备注
	private Integer del;//删除标记
	private Date ts;

	public EquipmentRuntime() {}

	public EquipmentRuntime(String id, String equipmentId, String firstDate, String lastDate, Date powerOn,
			Date powerOff, long total, long dailyTotal, long parameter, String status, String remark, Integer del,
			Date ts) {
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

	@Column(name="first_date")
	public String getFirstDate() {
		return firstDate;
	}

	public void setFirstDate(String firstDate) {
		this.firstDate = firstDate;
	}

	@Column(name="last_date")
	public String getLastDate() {
		return lastDate;
	}

	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	@Column(name="power_on")
	public Date getPowerOn() {
		return powerOn;
	}

	public void setPowerOn(Date powerOn) {
		this.powerOn = powerOn;
	}

	@Column(name="power_off")
	public Date getPowerOff() {
		return powerOff;
	}

	public void setPowerOff(Date powerOff) {
		this.powerOff = powerOff;
	}

	@Column(name="total")
	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	@Column(name="daily_total")
	public long getDailyTotal() {
		return dailyTotal;
	}

	public void setDailyTotal(long dailyTotal) {
		this.dailyTotal = dailyTotal;
	}

	@Column(name="parameter")
	public long getParameter() {
		return parameter;
	}

	public void setParameter(long parameter) {
		this.parameter = parameter;
	}

	@Column(name="status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		return "EquipmentRuntime [id=" + id + ", equipmentId=" + equipmentId + ", firstDate=" + firstDate
				+ ", lastDate=" + lastDate + ", powerOn=" + powerOn + ", powerOff=" + powerOff + ", total=" + total
				+ ", dailyTotal=" + dailyTotal + ", parameter=" + parameter + ", status=" + status + ", remark="
				+ remark + ", del=" + del + ", ts=" + ts + "]";
	}
	
}
