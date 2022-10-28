package com.cydeo.repository;

import com.cydeo.entity.Course;
import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Currency;
import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {

    //Find all courses by category ( SELECT WHERE category = ...) :
    List<Course> findByCategory(String category);


    //Find all courses by category and order the entities by name:
    List<Course> findByCategoryOrderByName (String category);

    //Check if a course with the supplied name exists. Return true if exists, false otherwise:
    boolean existsByName(String name);

    //Returns the count of courses for the given category:
    int countByCategory(String category);

    //Find all the courses that start with the given course name string :
    List<Course> findByNameStartsWith(String str);

    //Find all courses by category and return a stream :
    Stream<Course> streamAllByCategory(String category);

    //




}