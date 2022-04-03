package com.mano.projects.repository;

import com.mano.projects.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartRepository extends JpaRepository<Cart,Integer> {
//    @Modifying
//    @Query("delete from Cart c where c.userId=:userid or c.productId=:productid")
    Long removeCartByUserIdAndProductId(Integer userId,Integer productId );
}
