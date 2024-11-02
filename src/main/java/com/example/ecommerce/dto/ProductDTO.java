package com.example.ecommerce.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
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
    @PositiveOrZero(message = "Price cannot be a zero or a negative number")
    private Integer quantity;
    private List<CommentDTO> comments;
}
