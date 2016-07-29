package com.fu.logVisualization.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fu.logVisualization.entity.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {

	List<Agent> findByUserAgent(String userAgent);
}
