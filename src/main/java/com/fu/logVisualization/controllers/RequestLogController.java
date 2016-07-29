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
import com.fu.logVisualization.common.Paging;
import com.fu.logVisualization.entity.Requestlog;
import com.fu.logVisualization.repository.RequestLogRepository;

@Controller
@RequestMapping("/requestLogController")
public class RequestLogController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RequestLogController.class);

	@Autowired
	RequestLogRepository logRepository;

	@RequestMapping("/getRequestLogs")
	@ResponseBody
	public JsonResponse getRequestLogs(Paging paging) {
		
		LOGGER.info(paging.toString());

		JsonResponse response = new JsonResponse();
		
		try {
			long startTime = System.currentTimeMillis();
			PageRequest pageRequest = new PageRequest(paging.getPage()-1, paging.getLimit());
			Page<Requestlog> page = logRepository.findAll(pageRequest);
			
			response.setTotal(page.getTotalElements());
			response.setRecords(page.getContent());
			response.setSuccess(true);
			
			long endTime = System.currentTimeMillis();
			
			LOGGER.info("=== DONE ===");
			LOGGER.info("query time: " + (endTime - startTime)/1000);
			LOGGER.info("total element: " + page.getTotalElements());
			LOGGER.info("============");
		} catch (Exception e) {
			
			response.setSuccess(false);
			LOGGER.error(e.getMessage(), e);
		}
		
		return response;
	}
}
