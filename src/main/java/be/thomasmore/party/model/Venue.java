package be.thomasmore.party.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Venue {
    @Id
    private Integer id;
    private String venueName;
    private String linkMoreInfo;
    private int capacity;
    private boolean foodProvided;
    private boolean indoor;
    private boolean outdoor;
    private boolean freeParkingAvailable;
    private String city;
    private double distanceFromPublicTransportInKm;

    public Venue(String venueName, String linkMoreInfo) {
        this.venueName = venueName;
        this.linkMoreInfo = linkMoreInfo;
        this.capacity = 100;
        this.foodProvided = true;
        this.indoor = true;
        this.outdoor = false;
        this.freeParkingAvailable = false;
        this.city = "Tokyo";
        this.distanceFromPublicTransportInKm = 1.0;
    }

    public Venue() {
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getLinkMoreInfo() {
        return linkMoreInfo;
    }

    public void setLinkMoreInfo(String linkMoreInfo) {
        this.linkMoreInfo = linkMoreInfo;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean getFoodProvided() {
        return foodProvided;
    }

    public boolean getIndoor() {
        return indoor;
    }

    public boolean getOutdoor() {
        return outdoor;
    }

    public boolean getFreeParkingAvailable() {
        return freeParkingAvailable;
    }

    public String getCity() {
        return city;
    }

    public double getDistanceFromPublicTransportInKm() {
        return distanceFromPublicTransportInKm;
    }
}