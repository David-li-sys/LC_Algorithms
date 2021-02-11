package com.zlt.domain;

public class Business {
    Integer businessId;
    String businessName;
    int businessState;

    public Business() {
    }

    public Business(int businessId, String businessName, int businessState) {
        this.businessId = businessId;
        this.businessName = businessName;
        this.businessState = businessState;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public int getBusinessState() {
        return businessState;
    }

    public void setBusinessState(int businessState) {
        this.businessState = businessState;
    }

    @Override
    public String toString() {
        return "Business{" +
                "businessId=" + businessId +
                ", businessName='" + businessName + '\'' +
                ", businessState=" + businessState +
                '}';
    }
}
