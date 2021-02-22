package com.example.demo.service.Impl;

import com.example.demo.dto.ProductRequestDto;
import com.example.demo.dto.ProductResponseDto;

public interface ProductInterface {

    ProductResponseDto searchProducts(ProductRequestDto productRequestDto);
}
