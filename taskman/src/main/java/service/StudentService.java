package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.taskman.entities.Student;

import repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository stdr;
	
	public List<Student> findAllStudent(){
		return stdr.findAll();
	}
	
	public Student findById(Long id){
		return stdr.findById(id).orElse(null);
	}
	
	public void deleteById(Long id){
		stdr.deleteById(id);
	}
	
	public Student saveStd(Student std){
		return stdr.save(std);
	}
	
	public Student updateStd(Long id, Student std){
		std.setId(id);
		
		return stdr.save(std);
	}

}
