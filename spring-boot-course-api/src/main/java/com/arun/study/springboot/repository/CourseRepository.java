package com.arun.study.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.arun.study.springboot.model.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

}
