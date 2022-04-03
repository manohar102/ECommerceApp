package com.ecommerce.repository;

import com.ecommerce.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Integer> {
//    @Modifying
//    @Query("delete from Cart c where c.userId=:userid or c.productId=:productid")
    Long removeCartByUserIdAndProductId(Integer userId,Integer productId );
}
