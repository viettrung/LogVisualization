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
import com.fu.logVisualization.entity.Agent;
import com.fu.logVisualization.repository.AgentRepository;

@Controller
@RequestMapping("/agentController")
public class AgentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AgentController.class);

	@Autowired
	AgentRepository agentRepository;

	@RequestMapping("/getAgents")
	@ResponseBody
	public JsonResponse getAgentList(Paging paging) {
		
		LOGGER.info(paging.toString());

		JsonResponse response = new JsonResponse();
		
		try {
			PageRequest pageRequest = new PageRequest(paging.getPage()-1, paging.getLimit());
			Page<Agent> page = agentRepository.findAll(pageRequest);
			
			response.setTotal(page.getTotalElements());
			response.setRecords(page.getContent());
			response.setSuccess(true);

		} catch (Exception e) {
			
			response.setSuccess(false);
			LOGGER.error(e.getMessage(), e);
		}
		
		return response;
	}
}
