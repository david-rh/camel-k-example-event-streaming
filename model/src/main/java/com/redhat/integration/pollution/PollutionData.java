package com.redhat.integration.pollution;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class PollutionData {
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DateInfo {
        private Date utc;

        public Date getUtc() {
            return utc;
        }

        public void setUtc(Date utc) {
            this.utc = utc;
        }

    }

    public static class Coordinates {
        private double longitude;
        private double latitude;

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }
    }

    private int locationId;
    private String location;
    private String sensorType;
    private String entity;
    private String parameter;
    private DateInfo date;
    private double value;
    private String unit;
    private Coordinates coordinates;
    private String country;
    private String city;
    private boolean isMobile;
    private boolean isAnalysis;


    public int getLocationId() {
       return this.locationId;
    }

    public void setLocationId(int locationId) {
       this.locationId = locationId;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }
    
    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }
    
    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public DateInfo getDate() {
        return date;
    }

    public void setDate(DateInfo date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean getIsMobile() {
       return this.isMobile;
    }

    public void setIsMobile(boolean isMobile) {
       this.isMobile = isMobile;
    }

    public boolean getIsAnalysis() {
       return this.isAnalysis;
    }

    public void setIsAnalysis(boolean isAnalysis) {
       this.isAnalysis = isAnalysis;
    }

}

