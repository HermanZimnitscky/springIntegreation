package com.example.demo.integration;

import com.example.demo.data.ProductData;
import org.springframework.integration.annotation.Transformer;

import java.util.List;
import java.util.stream.Collectors;


public class PayloadTransformer {
    @Transformer
    public Integer transformToAmaunt(ProductData productData) {
        return productData.getAmount();
    }
}
