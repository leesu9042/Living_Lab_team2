package com.example.livinglab.dto;

import com.example.livinglab.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ScheduleForm {
    private String date;
    private String time;
    private String name;
    private String location;
    private Integer numOfPeople;
    private String department;
    private String note;


    public Schedule toEntity() {
        return new Schedule(null, date, time, name, location, numOfPeople, department, note);
    }


}
