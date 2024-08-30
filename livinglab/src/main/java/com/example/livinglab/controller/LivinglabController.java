package com.example.livinglab.controller;

import com.example.livinglab.dto.ScheduleForm;
import com.example.livinglab.entity.Schedule;
import com.example.livinglab.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LivinglabController {
    @Autowired
    ScheduleRepository scheduleRepository;

    @GetMapping("/schedule")
    public String scheduleAdd() {
        return "/schedules/new";
    }

    @PostMapping("/schedules/create")
    public String create(ScheduleForm scheduleForm) {
        System.out.println(scheduleForm.toString());
        Schedule schedule = scheduleForm.toEntity();
        System.out.println(schedule.toString());
        Schedule saved = scheduleRepository.save(schedule);
        System.out.println(saved.toString());
        return "";
    }
}
