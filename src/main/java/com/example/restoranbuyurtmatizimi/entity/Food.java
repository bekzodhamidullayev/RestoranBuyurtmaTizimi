package com.example.restoranbuyurtmatizimi.entity;

import com.example.restoranbuyurtmatizimi.enums.FoodStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import org.modelmapper.internal.asm.tree.IntInsnNode;

public class Food extends BaseEntity{

    @ManyToMany
    private Table table;
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer count;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private FoodStatus status;

}
