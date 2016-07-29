package com.fu.logVisualization.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fu.logVisualization.common.JsonResponse;
import com.fu.logVisualization.entity.RequestByHour;
import com.fu.logVisualization.repository.RequestByHourRepository;

@Controller
@RequestMapping("/hourController")
public class RequestByHourController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RequestByHourController.class);

	@Autowired
	RequestByHourRepository repository;

	@RequestMapping("/getCounts")
	@ResponseBody
	public JsonResponse getCounts() {
		JsonResponse response = new JsonResponse();
		try {
			long startTime = System.currentTimeMillis();
			List<RequestByHour> requestByHour = repository.findAll();
			
			response.setTotal(requestByHour.size());
			response.setSuccess(true);
			response.setRecords(requestByHour);
			
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
