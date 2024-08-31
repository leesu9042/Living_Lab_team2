package com.example.livinglab.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
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

    public Schedule(Long id, String date, String time, String name, String location, Integer numOfPeople, String department, String note) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.name = name;
        this.location = location;
        this.numOfPeople = numOfPeople;
        this.department = department;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", numOfPeople='" + numOfPeople + '\'' +
                ", department='" + department + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
