package sis;

import java.util.ArrayList;
import java.util.List;

public class CourseManagementImpl implements CourseManagement {
    private List<Course> courses;

    public CourseManagementImpl() {
        this.courses = new ArrayList<>();
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void removeCourse(int courseId) {
        courses.removeIf(course -> course.getCourseId() == courseId);
    }

    @Override
    public Course getCourse(int courseId) {
        return courses.stream()
                .filter(course -> course.getCourseId() == courseId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }
}
