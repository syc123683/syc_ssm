package com.syc.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@RequestMapping(value="/sayHello",method = RequestMethod.GET)
	@ResponseBody
	public String sayHello(){
        return "{\"returncode\":0,\"message\":\"hello worldsyc\"}";
    }
}
