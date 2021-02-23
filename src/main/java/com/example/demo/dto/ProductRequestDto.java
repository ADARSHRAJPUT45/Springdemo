package com.example.demo.dto;

public class ProductRequestDto {

    private String searchTerm;
    private String location;
    private  String getStockLocation = "stockLocation";

    public String getSearchTerm() {
        return searchTerm;
    }


    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String getLocation(){
        return location;
    }

    public void getLocation(String location) {
        this.location = location;
    }

    public String getGetStockLocation() {
        return getStockLocation;
    }

    public void setGetStockLocation(String getStockLocation) {
        this.getStockLocation = getStockLocation;
    }
}
