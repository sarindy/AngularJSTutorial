package com.example.service;

import java.util.List;

import com.example.model.Course;

public interface CourseService {

	public Course addCourse(Course course);
	public Course getCourse(Course course);
	public List<Course> getAllCourse();
	public Course updateCourse(Course course,Course newCourse);
	
}
