package com.YEW.transport;

import java.util.Date;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/5/18 17:42
 * @version: 1.0
 * @modified By:
 */
public class AirTransport {
    private String id;
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;

    void drivingMethod(){}

    public AirTransport() {
    }

    public AirTransport(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}
