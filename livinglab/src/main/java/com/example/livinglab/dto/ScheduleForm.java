package com.example.livinglab.dto;

import com.example.livinglab.entity.Schedule;

public class ScheduleForm {
    private String date;
    private String time;
    private String name;
    private String location;
    private Integer numOfPeople;
    private String department;
    private String note;

    public ScheduleForm(String date, String time, String name, String location, Integer numOfPeople, String department, String note) {
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
                "date=" + date +
                ", time=" + time +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", numOfPeople=" + numOfPeople +
                ", department='" + department + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public Schedule toEntity() {
        return new Schedule(null, date, time, name, location, numOfPeople, department, note);
    }


}
