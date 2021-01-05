package com.example.demo.integration;

import com.example.demo.data.ProductData;
import org.springframework.integration.annotation.Transformer;

import java.util.List;
import java.util.stream.Collectors;

public class PayloadAllTransformer {

    @Transformer
    public List<Integer> transformListToAmaunt(List<ProductData> productDataList) {
        return productDataList.stream().map(productData -> productData.getAmount()).collect(Collectors.toList());
    }
}
