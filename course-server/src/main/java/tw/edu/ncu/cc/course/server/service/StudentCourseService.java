package tw.edu.ncu.cc.course.server.service;

import tw.edu.ncu.cc.course.data.v1.Course;

public interface StudentCourseService {

    public Course[] readSelectedCourses( String studentID );
    public Course[] readTrackedCourses( String studentID );

}
