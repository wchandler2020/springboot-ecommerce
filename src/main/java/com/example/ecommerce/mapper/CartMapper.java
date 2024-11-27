package com.example.ecommerce.mapper;

import com.example.ecommerce.dto.CardItemDTO;
import com.example.ecommerce.dto.CartDTO;
import com.example.ecommerce.model.Cart;
import com.example.ecommerce.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface CartMapper {
    @Mapping(target = "userId", source = "user.id")
    CartMapper toDTO(Cart cart);
    @Mapping(target = "user.id", source = "userId")
    Cart toEntity(CartDTO cartDTO);
    @Mapping(target = "productId", source = "product.id")
    CardItemDTO toDTO(CartItem cartItem);
    @Mapping(target = "product.id", source = "productId")
    CartItem toEntity(CardItemDTO cardItemDTO);
}
