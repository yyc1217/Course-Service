package tw.edu.ncu.cc.course.server.controller.api.v1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tw.edu.ncu.cc.course.data.Unit;

@RestController
@RequestMapping( value = "api/v1/units" )
public class UnitSearchController {

    @RequestMapping( value = "colleges", method = RequestMethod.GET )
    public ResponseEntity searchAllColleges() {

        Unit[] units = new Unit[2];

        Unit unit1 = new Unit();
        unit1.setId( "deptI1I1000I0" );
        unit1.setName( "文學院" );
        units[0] = unit1;

        Unit unit2 = new Unit();
        unit2.setId( "deptI1I2000I0" );
        unit2.setName( "理學院" );
        units[1] = unit2;

        return new ResponseEntity<>( units, HttpStatus.OK );
    }

    @RequestMapping( value = "colleges/{collegeID}/departments", method = RequestMethod.GET )
    public ResponseEntity searchAllDepartmentsInCollege( @PathVariable( "collegeID" ) String collegeID ) {

        Unit[] units = new Unit[2];

        Unit unit1 = new Unit();
        unit1.setId( "deptI1I1000I0" );
        unit1.setName( "文學院" );
        units[0] = unit1;

        Unit unit2 = new Unit();
        unit2.setId( "deptI1I2000I0" );
        unit2.setName( "理學院" );
        units[1] = unit2;

        return new ResponseEntity<>( units, HttpStatus.OK );
    }

    @RequestMapping( value = "departments/{departmentID}/openfor", method = RequestMethod.GET )
    public ResponseEntity searchTargetStudentInDepartment( @PathVariable( "departmentID" ) String departmentID ) {

        Unit[] units = new Unit[2];

        Unit unit1 = new Unit();
        unit1.setId( "deptI1I1000I0" );
        unit1.setName( "文學院" );
        units[0] = unit1;

        Unit unit2 = new Unit();
        unit2.setId( "deptI1I2000I0" );
        unit2.setName( "理學院" );
        units[1] = unit2;

        return new ResponseEntity<>( units, HttpStatus.OK );
    }


}
