package com.example.demo.service.Impl.impl;

import com.example.demo.client.SearchClient;
import com.example.demo.dto.ProductRequestDto;
import com.example.demo.dto.ProductResponseDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
class ProductServiceImplTest {

    @InjectMocks
    private ProductServiceImpl searchService;

    @Mock
    private SearchClient searchClient;

    @BeforeEach
    public void init()
    {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getProducts() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> searchTermMockObject = objectMapper.readValue(
                new URL("file:src/test/resources/search.mock"), Map.class);
        Map<String, Object> locationMockObject = objectMapper.readValue(
                new URL("file:src/test/resources/location.mock"), Map.class);
        Mockito.when(searchClient.getProducts("Samsung")).thenReturn(searchTermMockObject);
        Mockito.when(searchClient.getProducts("stockLocation:\"Jakarta\"")).thenReturn(locationMockObject);

        ProductRequestDto requestDTO = new ProductRequestDto();
        requestDTO.setSearchTerm("Samsung");
        requestDTO.setStockLocation("Jakarta");
        ProductResponseDto response = searchService.searchProducts(requestDTO);
        assertEquals(response.getProductDtoList().size(), 10);
        assertEquals(response.getLocationList().size(), 10);
//      Mockito.verify(searchClient).
    }
}