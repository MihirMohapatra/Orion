package com.company.assync;

public class User {
    private int userId;
    private String name;
    private Enum productType;
    private String timeStamp;
    private String emailId;

    public User(int userId, String name, Enum productType, String timeStamp, String emailId) {
        this.userId = userId;
        this.name = name;
        this.productType = productType;
        this.timeStamp = timeStamp;
        this.emailId = emailId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getProductType() {
        return productType;
    }

    public void setProductType(Enum productType) {
        this.productType = productType;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", productType=" + productType +
                ", timeStamp='" + timeStamp + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
