package Com.Example.Demo.Service;

import java.util.List;

import Com.Example.Demo.Model.College;
import Com.Example.Demo.Model.Student;

public interface ServiceInter {
	
	
	
	
	int saveStudentData(Student student);
	
	List<Student> getAllStudentData();
	
	Student getStudentIdData(int id);
	
	Student updateStudentAndCollegeData(Student student);
	
	long countStudentAndCollegeUserData();

	
	void deleteStudentAndCollegeData(int id);
	
	
	College getOnlyCollegeDetailsData(String uname);
	
	
	
	
	
	
	
	
	
}
