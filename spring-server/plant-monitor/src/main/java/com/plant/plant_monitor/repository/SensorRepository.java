package com.plant.plant_monitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plant.plant_monitor.entity.SensorData;

public interface SensorRepository extends JpaRepository<SensorData, Long> {
}
