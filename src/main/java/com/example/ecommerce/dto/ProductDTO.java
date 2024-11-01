package com.example.ecommerce.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDTO {
    private Long id;
    @NotBlank(message = "Product name is required.")
    private String name;
    @NotBlank(message = "Product description is required.")
    private String description;
    private BigDecimal price;
    private Integer quantity;
    private List<CommentDTO> comments;
}
