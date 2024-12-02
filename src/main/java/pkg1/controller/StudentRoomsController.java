package pkg1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pkg1.entity.StudentRoomsEntity;
import pkg1.repo.StudentRoomsRepo;

@RestController
public class StudentRoomsController {
	@Autowired
	StudentRoomsRepo srr;
	
	@PostMapping("/studentRooms/add")
	public StudentRoomsEntity addStudentRooms(@RequestBody StudentRoomsEntity sre) {
		return srr.save(sre);
	}
	@GetMapping("/studentRooms/viewAll")
	public List<StudentRoomsEntity> viewAllStudentsRooms(){
		return srr.findAll();
	}
	@GetMapping("/studentRooms/view/{id}")
	public StudentRoomsEntity viewStudentRoomsById(@PathVariable long id){
		return srr.findById(id).orElseThrow(() -> new NullPointerException("student rooms not exist with id "+id));
	}
}
