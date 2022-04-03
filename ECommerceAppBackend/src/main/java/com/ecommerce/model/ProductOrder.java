package com.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="productOrder")
@Data @NoArgsConstructor
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE  , generator = "order_generator")
    @SequenceGenerator(name = "order_generator", sequenceName = "order_seq")
    private int orderId;

    private int productId;

    private int quantity;

    @Column(updatable = false)
    @CreationTimestamp @Temporal(TemporalType.DATE)
    private Date orderDate;

    @JsonBackReference
    @EqualsAndHashCode.Exclude @ToString.Exclude
    @ManyToOne @JoinColumn(name="userid")
    private User user;
}
