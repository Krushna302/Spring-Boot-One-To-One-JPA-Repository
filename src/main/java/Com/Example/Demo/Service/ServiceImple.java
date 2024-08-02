package Com.Example.Demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import Com.Example.Demo.Exception.StudentNotFound;
import Com.Example.Demo.Model.College;
import Com.Example.Demo.Model.Student;
import Com.Example.Demo.Repository.StudentRepository;

@Service
public class ServiceImple implements ServiceInter {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public int saveStudentData(Student student) {

		Student stu1 = studentRepository.save(student);

		return stu1.getId();

	}

	@Override
	public List<Student> getAllStudentData() {

		return studentRepository.findAll();
	}

	@Override
	public Student getStudentIdData(int id) {

		System.out.println("Fetchinng Student Id Data :-" + id);

		Optional<Student> optional = studentRepository.findById(id);

		if (optional.isPresent()) {

			return optional.get();

		} else {

			throw new StudentNotFound("Student Id Does Not Exists..!!");

		}

	}

	@Override
	public Student updateStudentAndCollegeData(Student student) {

		return studentRepository.save(student);

	}

	
	@Override
	public long countStudentAndCollegeUserData() {
		
	
		return studentRepository.count();
		
	}
	
		
	

	
	@Override
	public void deleteStudentAndCollegeData(int id) {
		
		studentRepository.deleteById(id);
	

	}

			
			
	
		
	

	@Override
	public College getOnlyCollegeDetailsData(String uname) {
		
	Optional <Student> optional =	studentRepository.findByCollegeUname(uname);
	
		if(optional.isPresent()) {
			
			Student student = optional.get();
			
			return student.getCollege();
			
		}
		
		else {
			
			throw new StudentNotFound("Student With UserName  " + uname + " Not Exists..!!");  
			
		}
	
	
		
		
	}

	

	
	
	
	
	
	
	
	
	
	

}
