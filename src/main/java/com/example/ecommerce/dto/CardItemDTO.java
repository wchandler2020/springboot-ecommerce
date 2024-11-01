package com.example.ecommerce.dto;

import lombok.Data;

@Data
public class CardItemDTO {
    private Long id;
    private Long productId;
    private Integer quantity;
}
