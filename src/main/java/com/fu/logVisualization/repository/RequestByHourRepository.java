package com.fu.logVisualization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fu.logVisualization.entity.RequestByHour;

public interface RequestByHourRepository extends JpaRepository<RequestByHour, Long> {
}
