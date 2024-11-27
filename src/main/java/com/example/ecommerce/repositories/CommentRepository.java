package com.example.ecommerce.repositories;

import com.example.ecommerce.model.Cart;
import com.example.ecommerce.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByProductId(Long productId);
}
