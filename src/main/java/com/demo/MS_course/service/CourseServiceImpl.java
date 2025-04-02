package com.demo.MS_course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.MS_course.entity.Course;
import com.demo.MS_course.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepo;

	@Override
	public String upsert(Course course) {
		courseRepo.save(course); // upsert (insert / update based on PK)
		return "success";
	}

	@Override
	public Course getById(Integer id) {
		Optional<Course> findById = courseRepo.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourse() {
		return courseRepo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if (courseRepo.existsById(id)) {
			courseRepo.deleteById(id);
			return "delete success";
		} else {
			return "No Record Found.";
		}
	}

}
