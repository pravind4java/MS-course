package com.demo.MS_course.service;

import java.util.List;

import com.demo.MS_course.entity.Course;

public interface CourseService {
	
	String upsert(Course course);
	
	Course getById(Integer id);
	
	List<Course>getAllCourse();
	
	String deleteById(Integer id);
}
