package com.fu.logVisualization.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fu.logVisualization.common.JsonResponse;
import com.fu.logVisualization.entity.RequestByDate;
import com.fu.logVisualization.repository.RequestByDateRepository;

@Controller
@RequestMapping("/dateController")
public class RequestByDateController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RequestByDateController.class);

	@Autowired
	RequestByDateRepository repository;

	@RequestMapping("/getCounts")
	@ResponseBody
	public JsonResponse getCounts() {
		JsonResponse response = new JsonResponse();
		try {
			long startTime = System.currentTimeMillis();
			List<RequestByDate> requestByDate = repository.findAll();
			
			response.setTotal(requestByDate.size());
			response.setSuccess(true);
			response.setRecords(requestByDate);
			
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
