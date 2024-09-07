package com.example.livinglab.controller;

import com.example.livinglab.dto.ScheduleForm;
import com.example.livinglab.entity.Schedule;
import com.example.livinglab.repository.ScheduleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
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
        log.info(scheduleForm.toString());
        Schedule schedule = scheduleForm.toEntity();
        log.info(schedule.toString());
        Schedule saved = scheduleRepository.save(schedule);
        log.info(saved.toString());
        return "";
    }
}
