package com.fu.logVisualization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fu.logVisualization.entity.RequestByDate;

public interface RequestByDateRepository extends JpaRepository<RequestByDate, Long> {
}
