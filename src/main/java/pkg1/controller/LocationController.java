package pkg1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pkg1.entity.LocationEntity;
import pkg1.repo.LocationRepo;

@RestController
public class LocationController {
	@Autowired
	LocationRepo lr;
	
	@PostMapping("/location/add")
	public LocationEntity addLocation(@RequestBody LocationEntity le) {
		return lr.save(le);
	}
	@GetMapping("/location/viewAll")
	public List<LocationEntity> viewAllLocations(){
		return lr.findAll();
	}
	@GetMapping("/locations/view/{id}")
	public LocationEntity viewLocationsById(@PathVariable long id){
		return lr.findById(id).orElseThrow(() -> new NullPointerException("location not exist with id "+id));
	}
}
