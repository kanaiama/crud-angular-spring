package com.wilson.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wilson.crudspring.model.Course;
import com.wilson.crudspring.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

  private CourseRepository courseRepository;

  //Substituído pelo AllArgsConstructor
  // public CourseController(CourseRepository courseRepository) {
  //   this.courseRepository = courseRepository;
  // }


  @GetMapping
  public @ResponseBody List<Course> list() {
    return courseRepository.findAll();
  }
}
