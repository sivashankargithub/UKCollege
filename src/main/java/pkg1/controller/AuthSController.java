package pkg1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pkg1.entity.AuthSEntity;
import pkg1.repo.AuthSRepo;

@RestController
public class AuthSController {
	@Autowired
	AuthSRepo asr;
	
	@PostMapping("/authS/add")
	public AuthSEntity addLocation(@RequestBody AuthSEntity ase) {
		return asr.save(ase);
	}
	@GetMapping("/authS/viewAll")
	public List<AuthSEntity> viewAllAuthS(){
		return asr.findAll();
	}
	@GetMapping("/authS/view/{id}")
	public AuthSEntity viewAuthSById(@PathVariable long id){
		return asr.findById(id).orElseThrow(() -> new NullPointerException("location not exist with id "+id));
	}
}
