package pkg1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pkg1.dto.StudentDto;
import pkg1.entity.LocationEntity;
import pkg1.entity.StudentEntity;
import pkg1.repo.LocationRepo;
import pkg1.repo.StudentRepo;

@RestController
public class StudentController {
	@Autowired
	StudentRepo sr;
	
	@Autowired
	LocationRepo lr;
	
	@PostMapping("/student/add")
	public StudentEntity addStudent(@RequestBody StudentDto sdto) {
		long locationId=sdto.getLocationId();
		StudentEntity student = new StudentEntity();
		LocationEntity location = lr.findById(locationId).orElseThrow(()-> new NullPointerException("No Location found with id "+locationId));
		student.setRollNo(sdto.getStudent().getRollNo());
		student.setStudentName(sdto.getStudent().getStudentName());
		student.setLocationId(location);
		return sr.save(student);
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
