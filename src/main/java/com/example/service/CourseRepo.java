package com.example.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Course;

@Repository
public interface CourseRepo extends CrudRepository<Course, Integer> {
	
	public Course findByCourseName(String courseName);

}
