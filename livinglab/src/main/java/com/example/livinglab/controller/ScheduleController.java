package com.example.livinglab.controller;

import com.example.livinglab.dto.ScheduleForm;
import com.example.livinglab.entity.Schedule;
import com.example.livinglab.repository.ScheduleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
public class ScheduleController {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @GetMapping("/schedule")
    public String scheduleAdd() {
        return "/schedules/new";
    }

    @PostMapping("/schedules/create")
    public String create(ScheduleForm scheduleForm) {
        log.info(scheduleForm.toString());
        //1. dto 엔티티로 변환
        Schedule schedule = scheduleForm.toEntity();
        log.info(schedule.toString());
        // 2. //리포지토리로 엔티티를 DB에 저장

        Schedule saved = scheduleRepository.save(schedule);
        log.info(saved.toString());
        return "/schedules/new";
    }


    @GetMapping("/schedules")
    public String index(Model model) {
        //1 데이터조회
        List<Schedule> scheduleEntityList = scheduleRepository.findAll();
        // 2 모델에 데이터 등록
        model.addAttribute("scheduleList", scheduleEntityList);
        // 3 뷰에 반환
        return "schedules/index";
    }

}
