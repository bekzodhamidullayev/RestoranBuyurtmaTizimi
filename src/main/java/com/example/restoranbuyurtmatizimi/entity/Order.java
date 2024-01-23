package com.example.restoranbuyurtmatizimi.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Order extends BaseEntity{
    @ManyToOne
    @JoinColumn(nullable = false, name = "table_id")
    private Table table;

    private Integer totalPrice;

}
