package com.example.ecommerce.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    @NotBlank(message = "Content cannot be left blank")
    private String content;
    @Min(1)
    @Max(5)
    private Integer score;
    private Long userId;
}
