package com.course.idea.model;

import java.util.List;

public interface CourseIdeaDAO {

    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();

}
