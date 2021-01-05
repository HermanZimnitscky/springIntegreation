package com.example.demo.integration;

import com.example.demo.data.PayloadData;
import com.example.demo.data.ProductData;
import com.example.demo.data.ProductsWrapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductGateway {
    Integer getTotal(@Payload PayloadData payloadData);

    List<Integer> getTotals(@Payload ProductsWrapper productsWrapper, @Header("url") String url, @Header("expectedType") ParameterizedTypeReference<List<ProductData>> expectedType);
}
