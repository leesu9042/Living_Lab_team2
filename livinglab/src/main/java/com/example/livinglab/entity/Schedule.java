package com.example.livinglab.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Schedule {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String date;
    @Column
    private String time;
    @Column
    private String name;
    @Column
    private String location;
    @Column
    private Integer numOfPeople;
    @Column
    private String department;
    @Column
    private String note;

}
