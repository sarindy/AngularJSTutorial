package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	@RequestMapping(value="/")
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping(value="/addCourseWeb" )
	public String getAddCourse() {
		return "addCourse";
	}

}
