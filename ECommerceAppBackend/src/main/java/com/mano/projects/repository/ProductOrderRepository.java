package com.mano.projects.repository;

import com.mano.projects.model.ProductOrder;
import com.mano.projects.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder,Integer> {

}
