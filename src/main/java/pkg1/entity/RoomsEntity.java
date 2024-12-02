package pkg1.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="rooms")
public class RoomsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String roomNo;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "location_id")
	private LocationEntity locationId;

	@OneToMany(mappedBy = "roomsId")
	private List<StudentRoomsEntity> Studentrooms;
	
	public RoomsEntity(long id, String roomNo, LocationEntity locationId) {
		super();
		this.id = id;
		this.roomNo = roomNo;
		this.locationId = locationId;
	}
	
	public RoomsEntity() {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public LocationEntity getLocationId() {
		return locationId;
	}
	public void setLocationId(LocationEntity locationId) {
		this.locationId = locationId;
	}
	
	

}
