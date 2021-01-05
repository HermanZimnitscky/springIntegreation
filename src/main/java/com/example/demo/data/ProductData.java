package com.example.demo.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductData {
    private String warehouse;

    private String product;

    private Integer amount;

    private boolean isNew;
}
