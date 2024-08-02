package Com.Example.Demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.Example.Demo.Exception.StudentNotFound;
import Com.Example.Demo.Model.College;
import Com.Example.Demo.Model.Student;
import Com.Example.Demo.Service.ServiceInter;

@RestController
public class StudentController {

	@Autowired
	private ServiceInter serviceinter;

	@PostMapping(value = "/saveStu")
	public ResponseEntity<String> saveData(@RequestBody Student student) {

		System.out.println("Check Student Data :" + student);

		int i = serviceinter.saveStudentData(student);

		if (i > 0) {

			return new ResponseEntity<String>("Student SuccessFully Register..!!", HttpStatus.CREATED);

		} else {

			return new ResponseEntity<String>("Student Not SuccessFully Register..!!", HttpStatus.NOT_FOUND);

		}

	}

	@GetMapping(value = "/getAll")
	public ResponseEntity<List<Student>> getAllStudentData() {

		System.out.println("In Controller List Student Data Get All :-");

		List<Student> liststu = serviceinter.getAllStudentData();

		return new ResponseEntity<List<Student>>(liststu, HttpStatus.OK);

	}

	@GetMapping(value = "/getIdStuData/{id}")
	public ResponseEntity<Student> getStudentIdData(@PathVariable int id) {

		System.out.println("Student Id Get Data :-" + id);

		Student stuId = serviceinter.getStudentIdData(id);

		return new ResponseEntity<Student>(stuId, HttpStatus.FOUND);

	}

	@PutMapping(value = "/updateStuAndClg")
	public ResponseEntity<String> updateStudentAndCollegeData(@RequestBody Student student) {

		System.out.println("Updata Student Data :-" + student);

		Student stu = serviceinter.updateStudentAndCollegeData(student);

		if (stu != student) {

			return new ResponseEntity<String>("Student And College Data Successfully Update..!!", HttpStatus.OK);

		} else {

			return new ResponseEntity<String>("Student And College Data Not Successfully Update..!",
					HttpStatus.NOT_FOUND);
		}

	}
	
	
	@GetMapping(value = "/countEnters")
	public ResponseEntity <?> countStudentAndCollegeUserData(){
		
		
	long count =  serviceinter.countStudentAndCollegeUserData();
	
	
	return new ResponseEntity<>(count, HttpStatus.OK);
		
		
	}
	
	
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity <String> deleteStudentAndCollegeData(@PathVariable int id){
		
		System.out.println("Student And College Delete Data :-"+id);
		
		
				serviceinter.deleteStudentAndCollegeData(id);
		
		return new ResponseEntity<String>("Delete Student And College Data :-"+id, HttpStatus.OK);
	}
	

		
	
	
	
	@GetMapping(value ="/getcollegeDetail/{uname}")
	public ResponseEntity<?> getOnlyCollegeDetailsData(@PathVariable String uname){
		
			College college =	serviceinter.getOnlyCollegeDetailsData(uname);
			
			if(college!=null) {
				
			return new ResponseEntity<>(college, HttpStatus.FOUND);
			
			}
			else {
				
		return new ResponseEntity<>("College UserName " + uname + "  Details Not Found..!!", HttpStatus.NOT_FOUND);
				
				
			}
	}
	

	
	
	

}
