package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepo courseRepo;

	
	@Override
	public Course getCourse(Course course) {
		courseRepo.findOne(course.getId());
		return course;
	}

	@Override
	public List<Course> getAllCourse() {
		List<Course> courseList = new ArrayList<>();
		courseRepo.findAll().forEach(courseList::add);
		return courseList;
	}

	@Override
	public Course updateCourse(Course course, Course newCourse) {
		Course updateCourse = new Course();
		updateCourse = courseRepo.findByCourseName(course.getCourseName());
		if (updateCourse != null) {
			updateCourse = newCourse;
			courseRepo.save(updateCourse);
			return newCourse;
		}
		return null;
	}

	@Override
	public Course addCourse(Course course) {
		courseRepo.save(course);
		return course;
	}

}
