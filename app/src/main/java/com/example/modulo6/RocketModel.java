package com.example.modulo6;

public class RocketModel {

    String rocketName;
    String launchDate;
    boolean launchSuccess;
    String payload;

    public RocketModel(String rocketName, String launchDate, boolean launchSuccess, String payload) {
        this.rocketName = rocketName;
        this.launchDate = launchDate;
        this.launchSuccess = launchSuccess;
        this.payload = payload;
    }

    public String getRocketName() {
        return rocketName;
    }

    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public boolean isLaunchSuccess() {
        return launchSuccess;
    }

    public void setLaunchSuccess(boolean launchSuccess) {
        this.launchSuccess = launchSuccess;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;


    }

    @Override
    public String toString() {
        return "RocketModel{" +
                "rocketName='" + rocketName + '\'' +
                ", launchDate='" + launchDate + '\'' +
                ", launchSuccess=" + launchSuccess +
                ", payload='" + payload + '\'' +
                '}';
    }
}
