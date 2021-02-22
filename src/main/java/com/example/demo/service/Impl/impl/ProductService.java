package com.example.demo.service.Impl.impl;


import com.example.demo.dto.ProductDto;
import com.example.demo.dto.ProductRequestDto;
import com.example.demo.dto.ProductResponseDto;
import com.example.demo.service.Impl.ProductInterface;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ProductService implements ProductInterface {

    @Override
    public ProductResponseDto searchProducts(ProductRequestDto productRequestDto)
    {
        ProductResponseDto response = new ProductResponseDto();
        ProductDto productDto = new ProductDto();
        productDto.setTitle("Nokia");
        productDto.setInStock(true);
        productDto.setSalePrice(8000);
        productDto.setDescription("New Nokia Series");
        response.setProductDtoList(Arrays.asList(productDto));
        return response;
    }
}
