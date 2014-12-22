package tw.edu.ncu.cc.course.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.edu.ncu.cc.course.data.Course;

@Service
public class StudentCourseServiceImpl implements StudentCourseService {

    private RemoteHttpService httpService;

    @Autowired
    public void setHttpService( RemoteHttpService httpService ) {
        this.httpService = httpService;
    }

    @Override
    public Course[] readSelectedCourses( String studentID ) {
        return httpService.getObject( Course[].class, "student/{studentID}/selected", studentID );
    }

    @Override
    public Course[] readTrackedCourses( String studentID ) {
        return httpService.getObject( Course[].class, "student/{studentID}/tracking", studentID );
    }

}
