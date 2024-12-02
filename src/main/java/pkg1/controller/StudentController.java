package pkg1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pkg1.entity.StudentEntity;
import pkg1.repo.StudentRepo;

@RestController
public class StudentController {
	@Autowired
	StudentRepo sr;
	
	@PostMapping("/student/add")
	public StudentEntity addStudent(@RequestBody StudentEntity se) {
		return sr.save(se);
	}
	@GetMapping("/student/viewAll")
	public List<StudentEntity> viewAllStudents(){
		return sr.findAll();
	}
	@GetMapping("/student/view/{id}")
	public StudentEntity viewStudentById(@PathVariable long id){
		return sr.findById(id).orElseThrow(() -> new NullPointerException("student not exist with id "+id));
	}
}
