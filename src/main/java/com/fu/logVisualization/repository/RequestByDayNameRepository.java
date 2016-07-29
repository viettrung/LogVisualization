package com.fu.logVisualization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fu.logVisualization.entity.RequestByDayName;

public interface RequestByDayNameRepository extends JpaRepository<RequestByDayName, Long> {
}
