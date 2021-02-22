package com.example.demo.mycontroller;

import com.example.demo.dto.ProductRequestDto;
import com.example.demo.dto.ProductResponseDto;
import com.example.demo.service.Impl.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ProductInterface productInterface;

    @PostMapping(value = "/search")
    public ProductResponseDto searchProducts(@RequestBody ProductRequestDto productRequestDto)
    {

        return productInterface.searchProducts(productRequestDto);
    }


}
