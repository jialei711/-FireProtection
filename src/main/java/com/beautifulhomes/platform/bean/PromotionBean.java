package com.beautifulhomes.platform.bean;

public class PromotionBean  {

    private String id;
    private String businessId;
    private String theme;
    private String name;
    private String city;
    private String start;
    private String end;
    private String details;
    private String remark;
    private Integer del;
    private String ts;

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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
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

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }



    public PromotionBean() {
    }

    public PromotionBean(String id, String businessId, String theme, String name, String city, String start, String end, String details, String remark, Integer del, String ts) {
        this.id = id;
        this.businessId = businessId;
        this.theme = theme;
        this.name = name;
        this.city = city;
        this.start = start;
        this.end = end;
        this.details = details;
        this.remark = remark;
        this.del = del;
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "PromotionBean{" +
                "id='" + id + '\'' +
                ", businessId='" + businessId + '\'' +
                ", theme='" + theme + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", details='" + details + '\'' +
                ", remark='" + remark + '\'' +
                ", del=" + del +
                ", ts='" + ts + '\'' +
                '}';
    }
}
