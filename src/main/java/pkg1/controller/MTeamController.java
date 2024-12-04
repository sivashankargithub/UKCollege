package pkg1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pkg1.entity.MTeamEntity;
import pkg1.repo.MTeamRepo;

@RestController
public class MTeamController {
	@Autowired
	MTeamRepo mtr;
	
	@PostMapping("/mTeam/add")
	public MTeamEntity addMTeam(@RequestBody MTeamEntity mte) {
		return mtr.save(mte);
	}
	@GetMapping("/mTeam/viewAll")
	public List<MTeamEntity> viewAllMTeam(){
		return mtr.findAll();
	}
	@GetMapping("/mTeam/view/{id}")
	public MTeamEntity viewMteamById(@PathVariable long id){
		return mtr.findById(id).orElseThrow(() -> new NullPointerException("mTeam not exist with id "+id));
	}
}
