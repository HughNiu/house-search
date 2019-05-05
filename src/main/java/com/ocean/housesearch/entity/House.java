package com.ocean.housesearch.entity;

import java.util.Date;

/**
 * 房源实体类
 * @author niu
 */
public class House {
    /**
     * 标题
     */
    private String title;
    /**
     * 面积
     */
    private int area;
    /**
     * 楼层
     */
    private int floor;

    /**
     * 总楼层
     */
    private int totalFloors;

    /**
     * 是否有电梯
     */
    private boolean hasLift;

    /**
     * 发布日期
     */
    private Date postDate;

    /**
     * 价格
     */
    private int price;

    /**
     * 中介
     */
    private String agent;

    /**
     * url
     */
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public boolean isHasLift() {
        return hasLift;
    }

    public void setHasLift(boolean hasLift) {
        this.hasLift = hasLift;
    }
}
