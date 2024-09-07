package com.example.livinglab.repository;

import com.example.livinglab.entity.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

    @Override
    ArrayList<Schedule> findAll();
}
