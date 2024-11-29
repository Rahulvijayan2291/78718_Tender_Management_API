package com.fresco.tenderManagement.model;

import javax.persistence.*;

@Entity
public class BiddingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private int biddingId;
    private final String projectName="Metro Phase V 2024";
    private Double bidAmount;
    private Double yearsToComplete;
    private String dateOfBidding;
    private String status="pending";
    private int bidderId;


    //constructor

    public BiddingModel() {
    }

    public BiddingModel(int id, int biddingId, Double bidAmount, Double yearsToComplete, String dateOfBidding, String status, int bidderId) {
        this.id = id;
        this.biddingId = biddingId;
        this.bidAmount = bidAmount;
        this.yearsToComplete = yearsToComplete;
        this.dateOfBidding = dateOfBidding;
        this.status = status;
        this.bidderId = bidderId;
    }

    public BiddingModel(int biddingId, Double bidAmount, Double yearsToComplete) {
        this.biddingId = biddingId;
        this.bidAmount = bidAmount;
        this.yearsToComplete = yearsToComplete;
    }

    public BiddingModel(String status) {
        this.status = status;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBiddingId() {
        return biddingId;
    }

    public void setBiddingId(int biddingId) {
        this.biddingId = biddingId;
    }

    public String getProjectName() {
        return projectName;
    }

    public Double getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(Double bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Double getYearsToComplete() {
        return yearsToComplete;
    }

    public void setYearsToComplete(Double yearsToComplete) {
        this.yearsToComplete = yearsToComplete;
    }

    public String getDateOfBidding() {
        return dateOfBidding;
    }

    public void setDateOfBidding(String dateOfBidding) {
        this.dateOfBidding = dateOfBidding;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBidderId() {
        return bidderId;
    }

    public void setBidderId(int bidderId) {
        this.bidderId = bidderId;
    }


    //to-string


    @Override
    public String toString() {
        return "BiddingModel{" +
                "id=" + id +
                ", biddingId=" + biddingId +
                ", name='" + projectName + '\'' +
                ", bidAmount=" + bidAmount +
                ", yearsToComplete=" + yearsToComplete +
                ", dateOfBidding='" + dateOfBidding + '\'' +
                ", status='" + status + '\'' +
                ", bidderId=" + bidderId +
                '}';
    }
}
