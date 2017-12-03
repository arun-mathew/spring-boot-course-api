package com.arun.study.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.study.springboot.model.Course;
import com.arun.study.springboot.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;

	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(course -> courses.add(course));
		return courses;
		
	}

	public void addCourse(Course course) {
		courseRepository.save(course);		
	}

	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
	
	

}
