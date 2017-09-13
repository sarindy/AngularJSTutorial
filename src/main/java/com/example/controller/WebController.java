package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	@RequestMapping(value="/")
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping(value="/app/addCourseWeb" )
	public String getAddCourse() {
		return "addCourse";
	}
	
	@RequestMapping(value="/app/001" )
	public String get001() {
		return "/websystique/001";
	}

}
