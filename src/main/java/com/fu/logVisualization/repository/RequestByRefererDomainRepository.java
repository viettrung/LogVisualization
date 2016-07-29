package com.fu.logVisualization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fu.logVisualization.entity.RequestByRefererDomain;

public interface RequestByRefererDomainRepository extends JpaRepository<RequestByRefererDomain, Long> {
}
