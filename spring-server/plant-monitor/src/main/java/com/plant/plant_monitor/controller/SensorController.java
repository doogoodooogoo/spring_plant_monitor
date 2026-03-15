package com.plant.plant_monitor.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class SensorController {

    @PostMapping("/sensor")
    public String receiveSensor(@RequestBody Map<String, Object> data) {

        System.out.println("Received data: " + data);

        return "ok";
    }
}
