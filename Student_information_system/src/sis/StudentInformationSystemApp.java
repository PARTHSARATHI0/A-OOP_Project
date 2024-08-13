package sis;

public class StudentInformationSystemApp {
    public static void main(String[] args) {
    	
        StudentManagement studentManagement = new StudentManagementImpl();
        CourseManagement courseManagement = new CourseManagementImpl();

        Student student1 = new Student(1, "Parthsarathi");
        Student student2 = new Student(2, "Abhinay");

        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);

        // Add Courses
        Course course1 = new Course(101, "Math");
        Course course2 = new Course(102, "Science");

        courseManagement.addCourse(course1);
        courseManagement.addCourse(course2);

        EnrollmentManagement enrollmentManagement = new EnrollmentManagement(studentManagement, courseManagement);
        enrollmentManagement.enrollStudentInCourse(1, 101); 
        enrollmentManagement.enrollStudentInCourse(2, 102); 

        for (Student student : studentManagement.getAllStudents()) {
            System.out.println(student.getName() + " is enrolled in:");
            for (Course course : student.getCourses()) {
                System.out.println("- " + course.getCourseName());
            }
        }
    }
}
