package tw.edu.ncu.cc.course.server.controller.api.v1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tw.edu.ncu.cc.course.data.Course;

@RestController
@RequestMapping( value = "api/v1/search" )
public class CourseSearchController {


    @RequestMapping( method = RequestMethod.GET )
    public ResponseEntity searchCourse( @RequestParam( value = "year", required = false ) Integer year,
                                        @RequestParam( value = "semester", required = false ) Integer semester,
                                        @RequestParam( value = "dept", required = false ) String deptartment,
                                        @RequestParam( value = "week", required = false ) Integer week,
                                        @RequestParam( value = "period", required = false ) Integer period,
                                        @RequestParam( value = "limit", required = false ) Integer limit,
                                        @RequestParam( value = "keyword" ) String keyword,
                                        @RequestHeader( value = "Accept_Language", required = false ) String language ) {
        Course course = new Course();
        course.setSerialNo( 12034 );
        course.setNo( "EL5001" );
        course.setClassNo( "*" );
        course.setName( "文學/文化理論導讀" );
        course.setClosed( false );
        course.setMemo( "限三、四年級" );
        course.setMasterDoctor( false );
        course.setLanguage( "Chinese" );
        course.setPasswordCard( Course.PasswordCard.no );
        course.setFirstRun( true );
        course.setPreSelect( true );
        course.setTeachers( "錢夫人,阿土伯" );
        course.setCredit( 2 );
        course.setClassRooms( "C2-209,C2-209" );
        course.setTime( "0-5,2-34" );
        course.setType( Course.RequireType.required );
        course.setFullHalf( Course.FullHalf.half );
        course.setMaxStudents( 0 );

        return new ResponseEntity<>( new Course[]{ course }, HttpStatus.OK );
    }

    @RequestMapping( value = "departments/{departmentId}", method = RequestMethod.GET )
    public ResponseEntity searchCourseOfDepartment( @PathVariable( value = "departmentId" ) String departmentID,
                                                    @RequestHeader( value = "Accept_Language", required = false ) String language ) {
        Course course = new Course();
        course.setSerialNo( 12034 );
        course.setNo( "EL5001" );
        course.setClassNo( "*" );
        course.setName( "文學/文化理論導讀" );
        course.setClosed( false );
        course.setMemo( "限三、四年級" );
        course.setMasterDoctor( false );
        course.setLanguage( "Chinese" );
        course.setPasswordCard( Course.PasswordCard.no );
        course.setFirstRun( true );
        course.setPreSelect( true );
        course.setTeachers( "錢夫人,阿土伯" );
        course.setCredit( 2 );
        course.setClassRooms( "C2-209,C2-209" );
        course.setTime( "0-5,2-34" );
        course.setType( Course.RequireType.required );
        course.setFullHalf( Course.FullHalf.half );
        course.setMaxStudents( 0 );

        return new ResponseEntity<>( new Course[]{ course }, HttpStatus.OK );
    }

    @RequestMapping( value = "openfor/{openforId}", method = RequestMethod.GET )
    public ResponseEntity searchCourseForStudent( @PathVariable( value = "openforId" ) String studentID,
                                                  @RequestHeader( value = "Accept_Language", required = false ) String language ) {
        Course course = new Course();
        course.setSerialNo( 12034 );
        course.setNo( "EL5001" );
        course.setClassNo( "*" );
        course.setName( "文學/文化理論導讀" );
        course.setClosed( false );
        course.setMemo( "限三、四年級" );
        course.setMasterDoctor( false );
        course.setLanguage( "Chinese" );
        course.setPasswordCard( Course.PasswordCard.no );
        course.setFirstRun( true );
        course.setPreSelect( true );
        course.setTeachers( "錢夫人,阿土伯" );
        course.setCredit( 2 );
        course.setClassRooms( "C2-209,C2-209" );
        course.setTime( "0-5,2-34" );
        course.setType( Course.RequireType.required );
        course.setFullHalf( Course.FullHalf.half );
        course.setMaxStudents( 0 );

        return new ResponseEntity<>( new Course[]{ course }, HttpStatus.OK );
    }

    @RequestMapping( value = "summer/{stage}", method = RequestMethod.GET )
    public ResponseEntity searchCourseInSummerVacation( @PathVariable( value = "stage" ) String stage,
                                                        @RequestHeader( value = "Accept_Language", required = false ) String language ) {
        Course course = new Course();
        course.setSerialNo( 12034 );
        course.setNo( "EL5001" );
        course.setClassNo( "*" );
        course.setName( "文學/文化理論導讀" );
        course.setClosed( false );
        course.setMemo( "限三、四年級" );
        course.setMasterDoctor( false );
        course.setLanguage( "Chinese" );
        course.setPasswordCard( Course.PasswordCard.no );
        course.setFirstRun( true );
        course.setPreSelect( true );
        course.setTeachers( "錢夫人,阿土伯" );
        course.setCredit( 2 );
        course.setClassRooms( "C2-209,C2-209" );
        course.setTime( "0-5,2-34" );
        course.setType( Course.RequireType.required );
        course.setFullHalf( Course.FullHalf.half );
        course.setMaxStudents( 0 );

        return new ResponseEntity<>( new Course[]{ course }, HttpStatus.OK );
    }

}
