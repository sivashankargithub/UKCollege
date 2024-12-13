package pkg1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pkg1.dto.RoomsDto;
import pkg1.entity.LocationEntity;
import pkg1.entity.RoomsEntity;
import pkg1.repo.LocationRepo;
import pkg1.repo.RoomsRepo;

@RestController
public class RoomsController {
	@Autowired
	RoomsRepo rr;
	
	@Autowired
	LocationRepo lr;
	
	@PostMapping("/rooms/add")
	public RoomsEntity addRooms(@RequestBody RoomsDto rdto) {
		long locationId=rdto.getLocationId();
		LocationEntity location = lr.findById(locationId).orElseThrow(()-> new NullPointerException("No Location found with id "+locationId));
		RoomsEntity rooms = new RoomsEntity();
		rooms.setRoomNo(rdto.getRoom().getRoomNo());
		rooms.setLocationId(location);
		return rr.save(rooms);
	}
	@GetMapping("/rooms/viewAll")
	public List<RoomsEntity> viewAllRooms(){
		return rr.findAll();
	}
	@GetMapping("/rooms/viewById/{id}")
	public RoomsEntity viewRoomsById(@PathVariable long id){
		return rr.findById(id).orElseThrow(() -> new NullPointerException("rooms not exist with id "+id));
	}
}
