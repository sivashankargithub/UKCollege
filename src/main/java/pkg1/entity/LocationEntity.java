package pkg1.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="locations")
public class LocationEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String cityName;
	private String address;
	@OneToMany(mappedBy = "locationId")
	private List<StudentEntity> student;
	@OneToMany(mappedBy = "locationId")
	private List<RoomsEntity> rooms;
	
	public LocationEntity(long id, String cityName, String address) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.address = address;
	}
	public LocationEntity() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
