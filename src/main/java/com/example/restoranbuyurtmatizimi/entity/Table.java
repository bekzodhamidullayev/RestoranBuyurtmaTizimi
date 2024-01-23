package com.example.restoranbuyurtmatizimi.entity;

import com.example.restoranbuyurtmatizimi.enums.TableStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Table extends BaseEntity{

    @OneToOne
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    @Column(nullable = false)
    private Integer place;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TableStatus status;

    private LocalDateTime bookingTime;
}
