package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.service.CourseService;

@RestController
public class ApiController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/api/addCourse",method=RequestMethod.POST)
	public Course addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
		return course;
		
	}
	
	@RequestMapping(value="/api/getAllCourse")
	public List<Course> getAllCourse() {
		List<Course> courseList = new ArrayList<>();
		courseService.getAllCourse().forEach(courseList::add);
		return courseList;
		
	}

}
