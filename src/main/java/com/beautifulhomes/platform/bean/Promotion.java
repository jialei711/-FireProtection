package com.beautifulhomes.platform.bean;




import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 *对应数据库表promotion
 * @author dong
 */
@Entity
@Table(name="promotion")
public class Promotion {

    /*
     * '主键,使用uuid'
     */
    @Id
    @GeneratedValue(generator = "IdGenerator")
    @GenericGenerator(name = "IdGenerator", strategy = "uuid")
    private String id;

    /*
     * '商家ID,活动由商家发起'
     */
    @Column(name="business_id")
    private String businessId;

    /*
     * '主题'
     */
    @Column(name="theme")
    private String theme;

    /*
     * '名称'
     */
    @Column(name="name")
    private String name;

    /*
     * '城市'
     */
    @Column(name="city")
    private String city;

    /*
     * '开始日期,采用(yyyy-MM-dd)格式'
     */
    @Column(name="start")
    private Date start;

    /*
     * '结束日期,采用(yyyy-MM-dd)格式'
     */
    @Column(name="end")
    private Date end;

    /*
     * '详情'
     */
    @Column(name="details")
    private String details;

    /*
     * '备注'
     */
    @Column(name="remark")
    private String remark;

    /*
     * '删除标记'
     */
    @Column(name="del")
    private Integer del;

    @Version
    @Column(name="ts")
    private Timestamp ts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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

    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
    }






}
