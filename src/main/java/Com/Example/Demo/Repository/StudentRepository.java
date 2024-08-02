package Com.Example.Demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import Com.Example.Demo.Model.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer>{
	
	
	Optional<Student> findByCollegeId(int id);

	
	Optional <Student> findByCollegeUname(String uname);
	
	
}
