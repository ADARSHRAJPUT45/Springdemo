package com.example.demo.dto;

import java.util.List;

public class ProductResponseDto {

    private List<ProductDto> productDtoList;
    private List<ProductDto> locationList;

    public List<ProductDto> getProductDtoList() {
        return productDtoList;
    }

    public void setProductDtoList(List<ProductDto> productDtoList) {
        this.productDtoList = productDtoList;
    }

    public List<ProductDto> getLocationList(){
        return locationList;
    }

    public void setLocationList(List<ProductDto> locationList){
        this.locationList = locationList;
    }


}
