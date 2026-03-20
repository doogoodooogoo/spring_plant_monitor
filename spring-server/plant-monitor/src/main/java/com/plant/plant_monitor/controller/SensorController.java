package com.plant.plant_monitor.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.plant.plant_monitor.entity.SensorData;
import com.plant.plant_monitor.repository.SensorRepository;
import java.time.LocalDateTime;

@RestController
public class SensorController {

    private final SensorRepository repository;

    public SensorController(SensorRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/sensor")
    public String save(@RequestBody SensorData data) {

        data.setCreatedAt(LocalDateTime.now()); // 추가
        repository.save(data);
        return "saved";
    }

    @GetMapping("/sensor")
    public List<SensorData> getAll() {
        return repository.findAll();
    }

}
