package com.fu.logVisualization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fu.logVisualization.entity.Requestlog;

public interface RequestLogRepository extends JpaRepository<Requestlog, Long> {
}
