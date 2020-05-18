package com.YEW.person;

import com.YEW.transport.AirTransport;
import com.YEW.transport.LandTransport;
import com.YEW.transport.MaritimeMeansOfTransport;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/5/18 17:39
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private String id;
    private int p_Age;
    private String p_Sex;
    private String p_Name;

    void driveTransport(AirTransport airTransport) {}
    void driveTransport(LandTransport landTransport){}
    void driveTransport(MaritimeMeansOfTransport maritimeMeansOfTransport){}

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getP_Age() {
        return p_Age;
    }

    public void setP_Age(int p_Age) {
        this.p_Age = p_Age;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }
}
