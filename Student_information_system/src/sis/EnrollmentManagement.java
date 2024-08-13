package sis;

public class EnrollmentManagement {
    private StudentManagement studentManagement;
    private CourseManagement courseManagement;

    public EnrollmentManagement(StudentManagement studentManagement, CourseManagement courseManagement) {
        this.studentManagement = studentManagement;
        this.courseManagement = courseManagement;
    }

    public void enrollStudentInCourse(int studentId, int courseId) {
        Student student = studentManagement.getStudent(studentId);
        Course course = courseManagement.getCourse(courseId);

        if (student != null && course != null) {
            student.enrollCourse(course);
            course.enrollStudent(student);
            System.out.println(student.getName() + " has been enrolled in " + course.getCourseName());
        } else {
            System.out.println("Enrollment failed: Invalid student ID or course ID.");
        }
    }
}
