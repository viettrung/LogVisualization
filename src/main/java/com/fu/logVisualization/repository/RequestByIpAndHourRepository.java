package com.fu.logVisualization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fu.logVisualization.entity.RequestByIpAndHour;

public interface RequestByIpAndHourRepository extends JpaRepository<RequestByIpAndHour, Long> {
}
