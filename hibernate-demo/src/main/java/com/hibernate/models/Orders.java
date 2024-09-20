package com.hibernate.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(updatable = false, insertable = false)
    private int personId;//FK, which means PK for some other table

    private int OrderNumber;

    private String orderDetails;

    @ManyToOne
    @JoinColumn(name = "personId")
    private Persons persons;

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", OrderNumber=" + OrderNumber +
                ", orderDetails='" + orderDetails + '\'' +
                '}';
    }
}
