package sis;

import java.util.List;

public interface CourseManagement {
    void addCourse(Course course);
    void removeCourse(int courseId);
    Course getCourse(int courseId);
    List<Course> getAllCourses();
}
