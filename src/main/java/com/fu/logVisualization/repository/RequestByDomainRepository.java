package com.fu.logVisualization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fu.logVisualization.entity.RequestByDomain;

public interface RequestByDomainRepository extends JpaRepository<RequestByDomain, Long> {
}
