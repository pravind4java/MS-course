package com.demo.MS_course.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.MS_course.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
