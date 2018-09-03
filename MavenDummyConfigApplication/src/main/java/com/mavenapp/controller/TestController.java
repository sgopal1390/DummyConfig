/**
 * 
 */
package com.mavenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mavenapp.entity.TestEntity;
import com.mavenapp.service.TestService;

/**
 * @author Nextalytics-10
 *
 */

@Controller
@RequestMapping("test")
public class TestController {

	@Autowired
	TestService testService;
	
	@ResponseBody
	@RequestMapping(value = "test")
	public String test(HttpServletRequest request) {

		TestEntity entity = new TestEntity();
		entity.setId(1L);
		entity.setMsg("test");
		
		testService.test(entity);
		
		return "test";
	}
}
