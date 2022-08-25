package com.buezman.springbootk8s.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDERS_TBL")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int qty;
    private double price;
}
