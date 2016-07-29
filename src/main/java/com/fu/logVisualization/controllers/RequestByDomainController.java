package com.fu.logVisualization.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fu.logVisualization.common.JsonResponse;
import com.fu.logVisualization.entity.RequestByDomain;
import com.fu.logVisualization.repository.RequestByDomainRepository;

@Controller
@RequestMapping("/domainController")
public class RequestByDomainController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RequestByDomainController.class);

	@Autowired
	RequestByDomainRepository repository;

	@RequestMapping("/getCounts")
	@ResponseBody
	public JsonResponse getCounts() {
		JsonResponse response = new JsonResponse();
		try {
			long startTime = System.currentTimeMillis();
			Page<RequestByDomain> page = repository.findAll(new PageRequest(0, 10));
			
			response.setTotal(page.getSize());
			response.setSuccess(true);
			response.setRecords(page.getContent());
			
			long endTime = System.currentTimeMillis();
			
			LOGGER.info("=== DONE ===");
			LOGGER.info("query time: " + (endTime - startTime)/1000);
		} catch (Exception e) {
			response.setSuccess(false);
			LOGGER.error(e.getMessage(), e);
		}
		return response;
	}
}
