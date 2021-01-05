package com.example.demo;

import com.example.demo.data.PayloadData;
import com.example.demo.data.ProductData;
import com.example.demo.data.ProductsWrapper;
import com.example.demo.integration.ProductGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.ParameterizedTypeReference;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ImportResource("integration.xml")
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private ProductGateway productGateway;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> products = new ArrayList<>();
        products.add("213123213");
        products.add("221321313");
        ProductsWrapper productsWrapper = new ProductsWrapper();
        productsWrapper.setProducts(products);
        PayloadData payloadData = new PayloadData();
        payloadData.setWareHauseCode("warehouse_e");
        payloadData.setProductCode("221321313");
        ParameterizedTypeReference<List<ProductData>> reference = new ParameterizedTypeReference<List<ProductData>>() {};
        List<Integer> productData = productGateway.getTotals(productsWrapper, "warehouse_e", reference);
        Integer productDatas = productGateway.getTotal(payloadData);
        System.out.println(productData);
        System.out.println(productDatas);
    }
}
