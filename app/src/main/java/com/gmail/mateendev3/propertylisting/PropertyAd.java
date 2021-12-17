package com.gmail.mateendev3.propertylisting;

public class PropertyAd {
    private final int propertyImageResId;
    private final String propertyTitle;
    private final String propertyPrice;
    private final String bathrooms;
    private final String carParking;
    private final String bedrooms;

    public PropertyAd(int propertyImageResId, String propertyTitle, String propertyPrice, String bathrooms, String carParking, String bedrooms) {
        this.propertyImageResId = propertyImageResId;
        this.propertyTitle = propertyTitle;
        this.propertyPrice = propertyPrice;
        this.bathrooms = bathrooms;
        this.carParking = carParking;
        this.bedrooms = bedrooms;
    }

    public void sum(int a, int b) {
    }

    public void sum(int b, int a, int c) {
    }

    public void sum(int a, byte b) {

    }

    public int getPropertyImageResId() {
        return propertyImageResId;
    }

    public String getPropertyTitle() {
        return propertyTitle;
    }

    public String getPropertyPrice() {
        return propertyPrice;
    }

    public String getBathrooms() {
        return bathrooms;
    }

    public String getCarParking() {
        return carParking;
    }

    public String getBedrooms() {
        return bedrooms;
    }
}
