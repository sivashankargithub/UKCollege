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
@Table(name="students")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String rollNo;
	private String studentName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "location_id")
	private LocationEntity locationId;
	
	@OneToMany(mappedBy = "studentId")
	private List<StudentRoomsEntity> Studentrooms;
	
	public StudentEntity(long id, String rollNo, String studentName, LocationEntity locationId) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.locationId = locationId;
	}
	public StudentEntity() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public LocationEntity getLocationId() {
		return locationId;
	}
	public void setLocationId(LocationEntity locationId) {
		this.locationId = locationId;
	}
}
