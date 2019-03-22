package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleControler {
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleControler.class);

	@RequestMapping("/hello/{str}")
	public Map<String , String> hello(@PathVariable String str) {
		LOGGER.debug("Request parameter:" + str);

		Map<String , String> response = new HashMap<>();
		response.put("requestParameter", str);
		return response;
	}
}
