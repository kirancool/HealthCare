package com.healthcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.healthcare.Service.HealthService;


@Controller
@RequestMapping(value = "healthcare/data")
public class HealthController {
	
	@RequestMapping(value="/gethealthBylanguage", method=RequestMethod.GET)
	public @ResponseBody String gethealthBylanguage(@RequestParam("language") String language, @RequestParam("contract_year") String contract_year) throws Exception
	{
		return HealthService.gethealthBylanguage();
	
	}
}
